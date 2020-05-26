package com.qiumuzi.VisualizeSong;

import edu.stanford.nlp.simple.Sentence;
import edu.stanford.nlp.trees.Tree;

import java.util.List;

public class SentenceParser {

    public void parse(){

        Sentence sent = new Sentence("Lucy is in the sky with diamonds.");
        List<String> nerTags = sent.nerTags();  // [PERSON, O, O, O, O, O, O, O]
        String firstPOSTag = sent.posTag(0);   // NNP
        Tree parseTree = sent.parse();
    }
}
