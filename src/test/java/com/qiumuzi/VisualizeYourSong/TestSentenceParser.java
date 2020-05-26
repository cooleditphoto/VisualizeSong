package com.qiumuzi.VisualizeYourSong;

import edu.stanford.nlp.simple.Sentence;
import edu.stanford.nlp.trees.Tree;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestSentenceParser {

    @Test
    public void testSentenceParser(){
        Sentence sent = new Sentence("Lucy is in the sky with diamonds.");
        Tree parseTree = sent.parse();
        List<Tree> leaves = parseTree.getLeaves();
    }
}
