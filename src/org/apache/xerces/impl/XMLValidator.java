/*
 * The Apache Software License, Version 1.1
 *
 *
 * Copyright (c) 1999,2000 The Apache Software Foundation.  All rights 
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer. 
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:  
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "Xerces" and "Apache Software Foundation" must
 *    not be used to endorse or promote products derived from this
 *    software without prior written permission. For written 
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache",
 *    nor may "Apache" appear in their name, without prior written
 *    permission of the Apache Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation and was
 * originally based on software copyright (c) 1999, International
 * Business Machines, Inc., http://www.apache.org.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */

package org.apache.xerces.impl;

import org.apache.xerces.impl.validation.GrammarPool;
import org.apache.xerces.impl.XMLErrorReporter;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLComponent;
import org.apache.xerces.xni.XMLComponentManager;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XMLAttributes;
import org.apache.xerces.xni.XMLDocumentFilter;
import org.apache.xerces.xni.XMLDocumentHandler;

import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

/**
 * @author Stubs generated by DesignDoc on Mon Sep 11 11:10:57 PDT 2000
 * @version $Id$
 */
public class XMLValidator
    implements XMLComponent, XMLDocumentFilter {

    //
    // Data
    //

    /** fSymbolTable */
    protected SymbolTable fSymbolTable;

    /** fErrorReporter */
    protected XMLErrorReporter fErrorReporter;

    /** fGrammarPool */
    protected GrammarPool fGrammarPool;

    /** fNamespaces */
    protected boolean fNamespaces;

    /** fValidation */
    protected boolean fValidation;

    /** fDynamicValidation */
    protected boolean fDynamicValidation;

    /** fDocumentHandler */
    protected XMLDocumentHandler fDocumentHandler;

    //
    // Constructors
    //

    /**
     * 
     */
    public XMLValidator() {
    }

    //
    // XMLComponent methods
    //

    /**
     * reset
     * 
     * @param configurationManager 
     */
    public void reset(XMLComponentManager configurationManager)
        throws SAXException {
    } // reset

    /**
     * setFeature
     * 
     * @param featureId 
     * @param state 
     */
    public void setFeature(String featureId, boolean state)
        throws SAXNotRecognizedException, SAXNotSupportedException {
    } // setFeature

    /**
     * setProperty
     * 
     * @param propertyId 
     * @param value 
     */
    public void setProperty(String propertyId, Object value)
        throws SAXNotRecognizedException, SAXNotSupportedException {
    } // setProperty

    //
    // XMLDocumentSource methods
    //

    /**
     * setDocumentHandler
     * 
     * @param documentHandler 
     */
    public void setDocumentHandler(XMLDocumentHandler documentHandler) {
    } // setDocumentHandler

    //
    // XMLEntityHandler methods
    //

    /** 
     * startEntity
     *
     * @param name
     * @param publicId
     * @param systemId
     * @param encoding
     */
    public void startEntity(String name, String publicId, String systemId,
                            String encoding) throws SAXException {
    }

    /**
     * endEntity
     * 
     * @param name 
     */
    public void endEntity(String name)
        throws SAXException {
    } // endEntity

    //
    // XMLDocumentHandler methods
    //

    /**
     * startDocument
     */
    public void startDocument()
        throws SAXException {
    } // startDocument

    /**
     * xmlDecl
     * 
     * @param version 
     * @param encoding 
     * @param standalone 
     */
    public void xmlDecl(String version, String encoding, String standalone)
        throws SAXException {
    } // xmlDecl

    /**
     * doctypeDecl
     * 
     * @param rootElement 
     * @param publicId 
     * @param systemId 
     */
    public void doctypeDecl(String rootElement, String publicId, String systemId)
        throws SAXException {
    } // doctypeDecl

    /**
     * comment
     * 
     * @param text 
     */
    public void comment(XMLString text)
        throws SAXException {
    } // comment

    /**
     * processingInstruction
     * 
     * @param target 
     * @param data 
     */
    public void processingInstruction(String target, XMLString data)
        throws SAXException {
    } // processingInstruction

    /**
     * startPrefixMapping
     * 
     * @param prefix 
     * @param uri 
     */
    public void startPrefixMapping(String prefix, String uri)
        throws SAXException {
    } // startPrefixMapping

    /**
     * startElement
     * 
     * @param element 
     * @param attributes 
     */
    public void startElement(QName element, XMLAttributes attributes)
        throws SAXException {
    } // startElement

    /**
     * characters
     * 
     * @param text 
     * @param whitespace 
     */
    public void characters(XMLString text, boolean whitespace)
        throws SAXException {
    } // characters

    /**
     * ignorableWhitespace
     * 
     * @param text 
     */
    public void ignorableWhitespace(XMLString text)
        throws SAXException {
    } // ignorableWhitespace

    /**
     * endElement
     * 
     * @param element 
     */
    public void endElement(QName element)
        throws SAXException {
    } // endElement

    /**
     * endPrefixMapping
     * 
     * @param prefix 
     */
    public void endPrefixMapping(String prefix)
        throws SAXException {
    } // endPrefixMapping

    /**
     * startCDATA
     */
    public void startCDATA()
        throws SAXException {
    } // startCDATA

    /**
     * endCDATA
     */
    public void endCDATA()
        throws SAXException {
    } // endCDATA

    /**
     * textDecl
     * 
     * @param version 
     * @param encoding 
     */
    public void textDecl(String version, String encoding) throws SAXException {
    } // textDecl

    /**
     * endDocument
     */
    public void endDocument()
        throws SAXException {
    } // endDocument

} // class XMLValidator
