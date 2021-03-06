package com.qiumuzi.VisualizeSong;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.neural.rnn.RNNCoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.util.CoreMap;

import java.util.Properties;

public class SentimentAnalyzer {

    public void SentimentAnalysis(String line){
        Properties props = new Properties();

        props.setProperty("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");

        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);

        // read some text in the text variable
        String text = "She went to America last week.";

        // create an empty Annotation just with the given text
        Annotation document = new Annotation(text);

        // run all Annotators on this text
        pipeline.annotate(document);

        System.out.println( "End of Processing" );


        int mainSentiment = 0;

        if (line != null && line.length() > 0) {

            int longest = 0;

            Annotation annotation = pipeline.process(line);

            for (CoreMap sentence : annotation.get(CoreAnnotations.SentencesAnnotation.class)) {

                Tree tree = sentence.get(SentimentCoreAnnotations.SentimentAnnotatedTree.class);

                int sentiment = RNNCoreAnnotations.getPredictedClass(tree);

                String partText = sentence.toString();

                if (partText.length() > longest) {

                    mainSentiment = sentiment;

                    longest = partText.length();

                }



            }

        }

        if (mainSentiment == 2 || mainSentiment > 4 || mainSentiment < 0) {


        }

    }
}
