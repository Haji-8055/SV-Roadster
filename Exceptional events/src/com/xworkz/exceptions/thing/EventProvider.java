package com.xworkz.exceptions.thing;

import java.awt.AWTError;
import java.awt.AWTException;
import java.awt.FontFormatException;
import java.awt.color.CMMException;
import java.awt.datatransfer.MimeTypeParseException;
import java.awt.image.ImagingOpException;
import java.beans.IntrospectionException;
import java.io.IOException;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.AlreadyBoundException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.rmi.MarshalException;
import java.rmi.NotBoundException;
import java.rmi.activation.ActivationException;
import java.security.GeneralSecurityException;
import java.security.acl.AclNotFoundException;
import java.security.acl.LastOwnerException;
import java.security.cert.CertificateException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.IllformedLocaleException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.concurrent.BrokenBarrierException;
import java.util.zip.DataFormatException;

import javax.lang.model.type.MirroredTypesException;
import javax.management.BadAttributeValueExpException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.InvalidApplicationException;
import javax.management.JMException;
import javax.management.JMRuntimeException;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.naming.NamingException;
import javax.security.auth.DestroyFailedException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.bind.DataBindingException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.ietf.jgss.GSSException;
import org.omg.CORBA.portable.ApplicationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;

import com.sun.javafx.geom.IllegalPathStateException;
import com.sun.javafx.geom.transform.NoninvertibleTransformException;

public class EventProvider {
	
	
	
	//runtime exception basically which dont need to be handled
	//also known as unchecked or runtime exceptions because ,,compiler will not check handling of exception
	public void runTimeException() throws RuntimeException
	{
		System.out.println("creating exception by RunTimeException class");
		
		throw new RuntimeException();
	}
	
	public void annotationTypeMismatchException() {
		System.out.println("Running the AnnotationTypeMismatchException");
		throw new AnnotationTypeMismatchException(null, null);
	}

	public void arithmeticException() {
		System.out.println("Running ArithmeticException");
		throw new ArithmeticException();
	}

	public void arrayStoreException() {
		System.out.println("Running ArrayStoreException");
		throw new ArrayStoreException();
	}

	public void bufferOverflowException() {
		System.out.println("Running BufferOverflowException");
		throw new BufferOverflowException();
	}

	public void bufferUnderflowException() {
		System.out.println("Running BufferUnderflowException");
		throw new BufferUnderflowException();
	}

	public void cannotRedoException() {
		System.out.println("Running CannotRedoException");
		throw new CannotRedoException();
	}

	public void cannotUndoException() {
		System.out.println("Running CannotUndoException");
		throw new CannotUndoException();
	}

	public void classCastException() {
		System.out.println("Running ClassCastException");
		throw new ClassCastException();
	}

	public void cMMException() {
		System.out.println("Running CMMException");
		throw new CMMException(null);
	}

	public void concurrentModificationException() {
		System.out.println("Running ConcurrentModificationException");
		throw new ConcurrentModificationException();
	}

	public void dataBindingException() {
		System.out.println("Running DataBindingException");
		throw new DataBindingException(null);
	}

	public void dOMException() {
		System.out.println("Running DOMException");
		throw new DOMException((short) 0, null);
	}

	public void emptyStackException() {
		System.out.println("Running EmptyStackException");
		throw new EmptyStackException();
	}

	public void enumConstantNotPresentException() {
		System.out.println("Running EnumConstantNotPresentException");
		throw new EnumConstantNotPresentException(null, null);
	}

	public void eventException() {
		System.out.println("Running EventException");
		throw new EventException((short) 0, null);
	}

	public void fileSystemAlreadyExistsException() {
		System.out.println("Running FileSystemAlreadyExistsException");
		throw new FileSystemAlreadyExistsException();
	}

	public void fileSystemNotFoundException() {
		System.out.println("Running FileSystemNotFoundException");
		throw new FileSystemNotFoundException();
	}

	public void illegalArgumentException() {
		System.out.println("Running IllegalArgumentException");
		throw new IllegalArgumentException();
	}

	public void illegalMonitorStateException() {
		System.out.println("Running IllegalMonitorStateException");
		throw new IllegalMonitorStateException();
	}

	public void illegalPathStateException() {
		System.out.println("Running IllegalPathStateException");
		throw new IllegalPathStateException();
	}

	public void illegalStateException() {
		System.out.println("Running IllegalStateException");
		throw new IllegalStateException();
	}

	public void illformedLocaleException() {
		System.out.println("Running IllformedLocaleException");
		throw new IllformedLocaleException();
	}

	public void imagingOpException() {
		System.out.println("Running ImagingOpException");
		throw new ImagingOpException(null);
	}

	
	

	public void incompleteAnnotationException() {
		System.out.println("Running IncompleteAnnotationException");
		throw new IncompleteAnnotationException(null, null);
	}

	public void indexOutOfBoundsException() {
		System.out.println("Running IndexOutOfBoundsException");
		throw new IndexOutOfBoundsException();
	}

	public void jMRuntimeException() {
		System.out.println("Running JMRuntimeException");
		throw new JMRuntimeException();
	}

	public void lSException() {
		System.out.println("Running LSException");
		throw new LSException((short) 0, null);
	}

	public void malformedParameterizedTypeException() {
		System.out.println("Running MalformedParameterizedTypeException");
		throw new MalformedParameterizedTypeException();
	}

	public void mirroredTypesException() {
		System.out.println("Running MirroredTypesException");
		throw new MirroredTypesException(null);
	}

	public void missingResourceException() {
		System.out.println("Running MissingResourceException");
		throw new MissingResourceException(null, null, null);
	}

	public void negativeArraySizeException() {
		System.out.println("Running NegativeArraySizeException");
		throw new NegativeArraySizeException();
	}

	public void noSuchElementException() {
		System.out.println("Running NoSuchElementException");
		throw new NoSuchElementException();
	}
	
	
	
	
	

	//compile time exception basically which  need to be handled
	//also known as checked and compile time exceptions ,,because compiler will ask or check for handling of exception,,but compiler cannot create an event only jvm can
	//exceptions from Exception class
	
	
	
	
	public void aclNotFoundException() throws AclNotFoundException
	{
		System.out.println("creating exception by Exception class");
		
		throw new AclNotFoundException();
	}
	
	
	
	public void  activationException() throws  ActivationException
	{
		System.out.println("creating exception by Exception class");
		
		throw new  ActivationException();
	}
	
	
	
	public void alreadyBoundException() throws AlreadyBoundException
	{
		System.out.println("creating exception by Exception class");
		
		throw new AlreadyBoundException();
	}
	
	
	
	public void  applicationException() throws  ApplicationException
	{
		System.out.println("creating exception by Exception class");
		
		throw new  ApplicationException(null, null) ;
	}
	
	
	public void  aWTException() throws  AWTException
	{
		System.out.println("creating exception by Exception class");
		
		throw new  AWTException(null);
	}
	
	
	
	public void  badAttributeValueExpException() throws  BadAttributeValueExpException
	{
		System.out.println("creating exception by Exception class");
		
		throw new  BadAttributeValueExpException(null);
	}
	
	
	
	
	
	public void  badBinaryOpValueExpException() throws  BadBinaryOpValueExpException
	{
		System.out.println("creating exception by badBinaryOpValueExpException class");
		
		throw new BadBinaryOpValueExpException(null);  
	}
	
	
	
	
	public void  badLocationException() throws  BadLocationException
	{
		System.out.println("creating exception by Exception class");
		
		throw new BadLocationException(null, 0)  ;
	}
	
	
	
	
	public void  badStringOperationException() throws  BadStringOperationException
	{
		System.out.println("creating exception by BadStringOperationException class");
		
		throw new  BadStringOperationException(null) ;
	}
	
	
	
	
	
	public void  brokenBarrierException() throws  BrokenBarrierException
	{
		System.out.println("creating exception by BrokenBarrierException class");
		
		throw new  BrokenBarrierException() ;
	}
	
	
	
	
	
	
	public void  certificateException() throws  CertificateException
	{
		System.out.println("creating exception by Exception class");
		
		throw new  CertificateException() ;
	}
	
	
	
	
	
	public void  cloneNotSupportedException() throws  CloneNotSupportedException
	{
		System.out.println("creating exception by CloneNotSupportedException class");
		
		throw new CloneNotSupportedException()  ;
	}
	
	
	
	
	
	public void  dataFormatException() throws  DataFormatException
	{
		System.out.println("creating exception by DataFormatException class");
		
		throw new DataFormatException() ;
	}
	
	
	
	
	public void  datatypeConfigurationException() throws  DatatypeConfigurationException
	{
		System.out.println("creating exception by DatatypeConfigurationException class");
		
		throw new DatatypeConfigurationException()  ;
	}
	
	
	
	public void  destroyFailedException() throws  DestroyFailedException
	{
		System.out.println("creating exception by DestroyFailedException class");
		
		throw new  DestroyFailedException() ;
	}

	
	
	
	
	public void  expandVetoException() throws  ExpandVetoException
	{
		System.out.println("creating exception by ExecutionException class");
		
		throw new  ExpandVetoException(null) ;
	}
	
	
	
	
	public void  fontFormatException() throws  FontFormatException
	{
		System.out.println("creating exception by FontFormatException class");
		
		throw new  FontFormatException(null) ;
	}
	
	
	
	
	public void  generalSecurityException() throws  GeneralSecurityException
	{
		System.out.println("creating exception by GeneralSecurityException class");
		
		throw new GeneralSecurityException() ;
	}
	
	
	
	
	
	public void  gSSException() throws  GSSException
	{
		System.out.println("creating exception by GSSException class");
		
		throw new  GSSException(0) ;
	}
	
	
	
	
	

	public void  illegalClassFormatException() throws  IllegalClassFormatException
	{
		System.out.println("creating exception by IllegalClassFormatException class");
		
		throw new  IllegalClassFormatException() ;
	}
	
	
	
	
	
	
	public void  interruptedException() throws  InterruptedException
	{
		System.out.println("creating exception by InterruptedException class");
		
		throw new  InterruptedException() ;
	}
	
	
	
	public void  introspectionException() throws  IntrospectionException
	{
		System.out.println("creating exception by IntrospectionException class");
		
		throw new  IntrospectionException(null) ;
	}
	
	
	
	public void  invalidApplicationException() throws  InvalidApplicationException
	{
		System.out.println("creating exception by InvalidApplicationException class");
		
		throw new  InvalidApplicationException(null) ;
	}
	
	
	

	public void  invalidTargetObjectTypeException() throws  InvalidTargetObjectTypeException
	{
		System.out.println("creating exception by InvalidTargetObjectTypeException class");
		
		throw new  InvalidTargetObjectTypeException(null) ;
	}
	
	
	
	
	public void  iOException() throws  IOException
	{
		System.out.println("creating exception by IOException class");
		
		throw new  IOException() ;
	}
	
	


	
	
	public void  jMException() throws  JMException
	{
		System.out.println("creating exception by JMException class");
		
		throw new  JMException() ;
	}

	
	
	
	public void  lastOwnerException() throws  LastOwnerException
	{
		System.out.println("creating exception by LastOwnerException class");
		
		throw new  LastOwnerException() ;
	}

	

	
	public void  LlneUnavailableException() throws  LineUnavailableException
	{
		System.out.println("creating exception by LineUnavailableException class");
		
		throw new  LineUnavailableException() ;
	}

	
	
	
	public void  marshalException() throws  MarshalException
	{
		System.out.println("creating exception by MarshalException class");
		
		throw new  MarshalException(null) ;
	}

	
	
	
	public void  midiUnavailableException() throws  MidiUnavailableException
	{
		System.out.println("creating exception by MidiUnavailableException class");
		
		throw new  MidiUnavailableException() ;
	}

	
	
	
	public void  mimeTypeParseException() throws  MimeTypeParseException
	{
		System.out.println("creating exception by MimeTypeParseException class");
		
		throw new  MimeTypeParseException() ;
	}

	

	public void  namingException() throws  NamingException
	{
		System.out.println("creating exception by NamingException class");
		
		throw new  NamingException() ;
	}

	
	
	public void  noninvertibleTransformException() throws  NoninvertibleTransformException
	{
		System.out.println("creating exception by NoninvertibleTransformException class");
		
		throw new  NoninvertibleTransformException(null) ;
	}

	
	
	
	public void  notBoundException() throws  NotBoundException
	{
		System.out.println("creating exception by NotBoundException class");
		
		throw new  NotBoundException() ;
	}
	
	//exceptions from error class
	

	
	
	public void  annotationFormatError() 
	{
		System.out.println("creating exception by NotBoundException class");
		
		throw new  AnnotationFormatError(null, null) ;
	}
	
	
	public void  assertionError() 
	{
		System.out.println("creating exception by AssertionError class");
		
		throw new  AssertionError() ;
	}
	
	
	
	public void  aWTError() 
	{
		System.out.println("creating exception by AWTError class");
		
		throw new  AWTError(null) ;
	}
	
	
	
	public void  factoryConfigurationError() 
	{
		System.out.println("creating exception by CoderMalfunctionError class");
		
		throw new  FactoryConfigurationError() ;
	}
	
	
	
	public void  linkageError() 
	{
		System.out.println("creating exception by NotBoundException class");
		
		throw new  LinkageError() ;
	}
	
	
	
	public void  threadDeath() 
	{
		System.out.println("creating exception by ThreadDeath class");
		
		throw new  ThreadDeath() ;
	}
	
	
	
	public void  transformerFactoryConfigurationError() 
	{
		System.out.println("creating exception by TransformerFactoryConfigurationError class");
		
		throw new  TransformerFactoryConfigurationError() ;
	}
	
	
	//from LinkageError-----class
	
	public void  bootstrapMethodError() 
	{
		System.out.println("creating exception by BootstrapMethodError class");
		
		throw new  BootstrapMethodError() ;
	}
	
	
	
	
	public void  classCircularityError() 
	{
		System.out.println("creating exception by ClassCircularityError class");
		
		throw new  ClassCircularityError() ;
	}
	
		
	
	
	public void  classFormatError() 
	{
		System.out.println("creating exception by ClassFormatError class");
		
		throw new  ClassFormatError() ;
	}
	
	
	
	
	public void  exceptionInInitializerError()
	{
		System.out.println("creating exception by ExceptionInInitializerError class");
		
		throw new  ExceptionInInitializerError() ;
	}
	
	
	
	public void  incompatibleClassChangeError() 
	{
		System.out.println("creating exception by NotBoundException class");
		
		throw new  IncompatibleClassChangeError() ;
	}
	
	
	
	public void  noClassDefFoundError() 
	{
		System.out.println("creating exception by NoClassDefFoundError class");
		
		throw new  NoClassDefFoundError() ;
	}
	
	
	
	
	public void  unsatisfiedLinkError() 
	{
		System.out.println("creating exception by UnsatisfiedLinkError class");
		
		throw new  UnsatisfiedLinkError() ;
	}
	
	
	
	public void  verifyError() 
	{
		System.out.println("creating exception by VerifyError class");
		
		throw new  VerifyError() ;
	}
	
	//from VirtualMachineError class 

	
	public void  internalError() 
	{
		System.out.println("creating exception by InternalError class");
		
		throw new  InternalError() ;
	}
	
	
	
	
	public void  outOfMemoryError() 
	{
		System.out.println("creating exception by OutOfMemoryError class");
		
		throw new  OutOfMemoryError() ;
	}
	
	
	
	
	
	public void  stackOverflowError() 
	{
		System.out.println("creating exception by NotBoundException class");
		
		throw new  StackOverflowError() ;
	}
	
	//, 
	
	
	public void  genericSignatureFormatError() 
	{
		System.out.println("creating exception by GenericSignatureFormatError class");
		
		throw new  GenericSignatureFormatError() ;
	}
	
	
	
	
	public void  unsupportedClassVersionError() 
	{
		System.out.println("creating exception by UnsupportedClassVersionError class");
		
		throw new  UnsupportedClassVersionError() ;
	}
	
	
	public void  abstractMethodError() 
	{
		System.out.println("creating exception by AbstractMethodError class");
		
		throw new  AbstractMethodError() ;
	}
	
	
	
	public void  illegalAccessError() 
	{
		System.out.println("creating exception by IllegalAccessError class");
		
		throw new  IllegalAccessError() ;
	}
	
	
	
	public void  instantiationError() 
	{
		System.out.println("creating exception by InstantiationError class");
		
		throw new  InstantiationError() ;
	}
	
	
	
	public void  noSuchFieldError() 
	{
		System.out.println("creating exception by NoSuchFieldError class");
		
		throw new  NoSuchFieldError() ;
	}
	
	
	
	public void  noSuchMethodError() 
	{
		System.out.println("creating exception by NoSuchMethodError class");
		
		throw new  NoSuchMethodError() ;
	}
	
	
	
	
	
	
	
	

}
