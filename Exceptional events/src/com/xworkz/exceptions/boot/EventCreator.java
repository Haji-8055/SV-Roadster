package com.xworkz.exceptions.boot;

import java.awt.FontFormatException;
import java.awt.datatransfer.MimeTypeParseException;
import java.beans.IntrospectionException;
import java.io.IOException;
import java.lang.instrument.IllegalClassFormatException;
import java.rmi.NotBoundException;
import java.rmi.activation.ActivationException;
import java.security.GeneralSecurityException;
import java.security.acl.AclNotFoundException;
import java.security.acl.LastOwnerException;
import java.util.concurrent.BrokenBarrierException;
import java.util.zip.DataFormatException;

import javax.management.BadAttributeValueExpException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.InvalidApplicationException;
import javax.management.JMException;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.naming.NamingException;
import javax.security.auth.DestroyFailedException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.xml.datatype.DatatypeConfigurationException;

import org.ietf.jgss.GSSException;
import org.omg.CORBA.portable.ApplicationException;

import com.sun.javafx.geom.transform.NoninvertibleTransformException;
import com.xworkz.exceptions.thing.EventProvider;

public class EventCreator {

	public static void main(String[] args) throws AclNotFoundException, ActivationException, ApplicationException,
			BadBinaryOpValueExpException, BadAttributeValueExpException, BadLocationException,
			BadStringOperationException, BrokenBarrierException, CloneNotSupportedException, DataFormatException,
			DatatypeConfigurationException, DestroyFailedException, ExpandVetoException, GeneralSecurityException,
			FontFormatException, GSSException, IllegalClassFormatException, InterruptedException,
			IntrospectionException, InvalidApplicationException, InvalidTargetObjectTypeException, IOException,
			JMException, LastOwnerException, LineUnavailableException, MidiUnavailableException, MimeTypeParseException,
			NamingException, NoninvertibleTransformException, NotBoundException {

		EventProvider eventProvider = new EventProvider();

		// runtime exception,or unchecked
		eventProvider.runTimeException();
		eventProvider.annotationTypeMismatchException();
		eventProvider.arithmeticException();
		eventProvider.arrayStoreException();
		eventProvider.bufferOverflowException();
		eventProvider.bufferUnderflowException();
		eventProvider.cannotRedoException();
		eventProvider.cannotUndoException();
		eventProvider.classCastException();
		eventProvider.cMMException();
		eventProvider.concurrentModificationException();
		eventProvider.dataBindingException();
		eventProvider.dOMException();
		eventProvider.emptyStackException();
		eventProvider.enumConstantNotPresentException();
		eventProvider.eventException();
		eventProvider.fileSystemAlreadyExistsException();
		eventProvider.fileSystemNotFoundException();
		eventProvider.illegalArgumentException();
		eventProvider.illegalMonitorStateException();
		eventProvider.illegalPathStateException();
		eventProvider.illegalStateException();
		eventProvider.illformedLocaleException();
		eventProvider.imagingOpException();
		eventProvider.incompleteAnnotationException();
		eventProvider.indexOutOfBoundsException();
		eventProvider.jMRuntimeException();
		eventProvider.lSException();
		eventProvider.malformedParameterizedTypeException();
		eventProvider.mirroredTypesException();
		eventProvider.missingResourceException();
		eventProvider.negativeArraySizeException();
		eventProvider.noSuchElementException();

		// to be handled exceptions or compile time
		eventProvider.aclNotFoundException();
		eventProvider.activationException();
		eventProvider.alreadyBoundException();
		eventProvider.applicationException();
		eventProvider.aWTError();
		eventProvider.badAttributeValueExpException();
		eventProvider.badBinaryOpValueExpException();
		eventProvider.badLocationException();
		eventProvider.badStringOperationException();
		eventProvider.brokenBarrierException();
		eventProvider.certificateException();
		eventProvider.cloneNotSupportedException();
		eventProvider.dataFormatException();
		eventProvider.datatypeConfigurationException();
		eventProvider.destroyFailedException();
		eventProvider.expandVetoException();
		eventProvider.fontFormatException();
		eventProvider.generalSecurityException();
		eventProvider.gSSException();
		eventProvider.illegalClassFormatException();
		eventProvider.interruptedException();
		eventProvider.introspectionException();
		eventProvider.invalidApplicationException();
		eventProvider.invalidTargetObjectTypeException();
		eventProvider.iOException();
		eventProvider.jMException();
		eventProvider.lastOwnerException();
		eventProvider.LlneUnavailableException();
		eventProvider.marshalException();
		eventProvider.midiUnavailableException();
		eventProvider.mimeTypeParseException();
		eventProvider.namingException();
		eventProvider.noninvertibleTransformException();
		eventProvider.notBoundException();

		// error exceptions
		eventProvider.annotationFormatError();
		eventProvider.assertionError();
		eventProvider.aWTError();
		eventProvider.factoryConfigurationError();
		eventProvider.linkageError();
		eventProvider.threadDeath();
		eventProvider.transformerFactoryConfigurationError();
		eventProvider.bootstrapMethodError();
		eventProvider.classCircularityError();
		eventProvider.classFormatError();
		eventProvider.exceptionInInitializerError();
		eventProvider.incompatibleClassChangeError();
		eventProvider.noClassDefFoundError();
		eventProvider.unsatisfiedLinkError();
		eventProvider.verifyError();
		eventProvider.internalError();
		eventProvider.outOfMemoryError();
		eventProvider.stackOverflowError();
		eventProvider.genericSignatureFormatError();
		eventProvider.unsupportedClassVersionError();
		eventProvider.abstractMethodError();
		eventProvider.illegalAccessError();
		eventProvider.instantiationError();
		eventProvider.noSuchFieldError();
		eventProvider.noSuchMethodError();

	}

}
