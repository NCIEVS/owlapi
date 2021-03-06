/* Generated By:JavaCC: Do not edit this line. TurtleParserConstants.java */
package org.semanticweb.owlapi.rdf.turtle.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
interface TurtleParserConstants {

    /**
     * End of File.
     */
    int EOF = 0;
    /**
     * RegularExpression Id.
     */
    int COMMENT = 5;
    /**
     * RegularExpression Id.
     */
    int QUOTE = 6;
    /**
     * RegularExpression Id.
     */
    int STRING = 9;
    /**
     * RegularExpression Id.
     */
    int SINGLEQUOTE = 10;
    /**
     * RegularExpression Id.
     */
    int SINGLESTRING = 13;
    /**
     * RegularExpression Id.
     */
    int TRIQUOTE = 14;
    /**
     * RegularExpression Id.
     */
    int LONG_STRING = 17;
    /**
     * RegularExpression Id.
     */
    int TRISINGLEQUOTE = 18;
    /**
     * RegularExpression Id.
     */
    int LONG_SINGLESTRING = 21;
    /**
     * RegularExpression Id.
     */
    int DIGIT = 22;
    /**
     * RegularExpression Id.
     */
    int INTEGER = 23;
    /**
     * RegularExpression Id.
     */
    int DOUBLE = 24;
    /**
     * RegularExpression Id.
     */
    int DECIMAL = 25;
    /**
     * RegularExpression Id.
     */
    int EXPONENT = 26;
    /**
     * RegularExpression Id.
     */
    int OPENPAR = 27;
    /**
     * RegularExpression Id.
     */
    int CLOSEPAR = 28;
    /**
     * RegularExpression Id.
     */
    int OPEN_SQUARE_BRACKET = 29;
    /**
     * RegularExpression Id.
     */
    int CLOSE_SQUARE_BRACKET = 30;
    /**
     * RegularExpression Id.
     */
    int COMMA = 31;
    /**
     * RegularExpression Id.
     */
    int DOT = 32;
    /**
     * RegularExpression Id.
     */
    int SEMICOLON = 33;
    /**
     * RegularExpression Id.
     */
    int PREFIX = 34;
    /**
     * RegularExpression Id.
     */
    int DOUBLE_CARET = 35;
    /**
     * RegularExpression Id.
     */
    int BASE = 36;
    /**
     * RegularExpression Id.
     */
    int AT = 37;
    /**
     * RegularExpression Id.
     */
    int A = 38;
    /**
     * RegularExpression Id.
     */
    int EMPTY_BLANK_NODE = 39;
    /**
     * RegularExpression Id.
     */
    int NODE_ID_START = 40;
    /**
     * RegularExpression Id.
     */
    int TRUE = 41;
    /**
     * RegularExpression Id.
     */
    int FALSE = 42;
    /**
     * RegularExpression Id.
     */
    int SELECT = 43;
    /**
     * RegularExpression Id.
     */
    int WHERE = 44;
    /**
     * RegularExpression Id.
     */
    int FILTER = 45;
    /**
     * RegularExpression Id.
     */
    int LETTER = 46;
    /**
     * RegularExpression Id.
     */
    int FULLIRI = 47;
    /**
     * RegularExpression Id.
     */
    int PNAME_NS = 48;
    /**
     * RegularExpression Id.
     */
    int PN_LOCAL = 49;
    /**
     * RegularExpression Id.
     */
    int PNAME_LN = 50;
    /**
     * RegularExpression Id.
     */
    int PN_PREFIX = 51;
    /**
     * RegularExpression Id.
     */
    int PN_CHARS_BASE = 52;
    /**
     * RegularExpression Id.
     */
    int PN_CHARS = 53;
    /**
     * RegularExpression Id.
     */
    int PN_CHARS_U = 54;
    /**
     * RegularExpression Id.
     */
    int NODEID = 55;
    /**
     * RegularExpression Id.
     */
    int ERROR = 56;

    /**
     * Lexical state.
     */
    int DEFAULT = 0;
    /**
     * Lexical state.
     */
    int IN_STRING = 1;
    /**
     * Lexical state.
     */
    int IN_SINGLESTRING = 2;
    /**
     * Lexical state.
     */
    int IN_LONG_STRING = 3;
    /**
     * Lexical state.
     */
    int IN_LONG_SINGLESTRING = 4;

    /**
     * Literal token values.
     */
    String[] tokenImage = {
        "<EOF>",
        "\" \"",
        "\"\\n\"",
        "\"\\t\"",
        "\"\\r\"",
        "<COMMENT>",
        "\"\\\"\"",
        "<token of kind 7>",
        "<token of kind 8>",
        "\"\\\"\"",
        "\"\\\'\"",
        "<token of kind 11>",
        "<token of kind 12>",
        "\"\\\'\"",
        "\"\\\"\\\"\\\"\"",
        "<token of kind 15>",
        "<token of kind 16>",
        "\"\\\"\\\"\\\"\"",
        "\"\\\'\\\'\\\'\"",
        "<token of kind 19>",
        "<token of kind 20>",
        "\"\\\'\\\'\\\'\"",
        "<DIGIT>",
        "<INTEGER>",
        "<DOUBLE>",
        "<DECIMAL>",
        "<EXPONENT>",
        "\"(\"",
        "\")\"",
        "\"[\"",
        "\"]\"",
        "\",\"",
        "\".\"",
        "\";\"",
        "\"@prefix\"",
        "\"^^\"",
        "\"@base\"",
        "\"@\"",
        "\"a\"",
        "<EMPTY_BLANK_NODE>",
        "\"_:\"",
        "\"true\"",
        "\"false\"",
        "\"SELECT\"",
        "\"WHERE\"",
        "\"FILTER\"",
        "<LETTER>",
        "<FULLIRI>",
        "<PNAME_NS>",
        "<PN_LOCAL>",
        "<PNAME_LN>",
        "<PN_PREFIX>",
        "<PN_CHARS_BASE>",
        "<PN_CHARS>",
        "<PN_CHARS_U>",
        "<NODEID>",
        "<ERROR>",
    };

}
