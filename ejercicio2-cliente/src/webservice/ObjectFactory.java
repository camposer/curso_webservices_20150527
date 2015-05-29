
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddPerson_QNAME = new QName("http://webservice/", "addPerson");
    private final static QName _AddPersonResponse_QNAME = new QName("http://webservice/", "addPersonResponse");
    private final static QName _FindPerson_QNAME = new QName("http://webservice/", "findPerson");
    private final static QName _FindPersonResponse_QNAME = new QName("http://webservice/", "findPersonResponse");
    private final static QName _FindPersons_QNAME = new QName("http://webservice/", "findPersons");
    private final static QName _FindPersonsResponse_QNAME = new QName("http://webservice/", "findPersonsResponse");
    private final static QName _Person_QNAME = new QName("http://webservice/", "person");
    private final static QName _RemovePerson_QNAME = new QName("http://webservice/", "removePerson");
    private final static QName _RemovePersonResponse_QNAME = new QName("http://webservice/", "removePersonResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://webservice/", "updatePerson");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://webservice/", "updatePersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddPerson }
     * 
     */
    public AddPerson createAddPerson() {
        return new AddPerson();
    }

    /**
     * Create an instance of {@link AddPersonResponse }
     * 
     */
    public AddPersonResponse createAddPersonResponse() {
        return new AddPersonResponse();
    }

    /**
     * Create an instance of {@link FindPerson }
     * 
     */
    public FindPerson createFindPerson() {
        return new FindPerson();
    }

    /**
     * Create an instance of {@link FindPersonResponse }
     * 
     */
    public FindPersonResponse createFindPersonResponse() {
        return new FindPersonResponse();
    }

    /**
     * Create an instance of {@link FindPersons }
     * 
     */
    public FindPersons createFindPersons() {
        return new FindPersons();
    }

    /**
     * Create an instance of {@link FindPersonsResponse }
     * 
     */
    public FindPersonsResponse createFindPersonsResponse() {
        return new FindPersonsResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link RemovePerson }
     * 
     */
    public RemovePerson createRemovePerson() {
        return new RemovePerson();
    }

    /**
     * Create an instance of {@link RemovePersonResponse }
     * 
     */
    public RemovePersonResponse createRemovePersonResponse() {
        return new RemovePersonResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "addPerson")
    public JAXBElement<AddPerson> createAddPerson(AddPerson value) {
        return new JAXBElement<AddPerson>(_AddPerson_QNAME, AddPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "addPersonResponse")
    public JAXBElement<AddPersonResponse> createAddPersonResponse(AddPersonResponse value) {
        return new JAXBElement<AddPersonResponse>(_AddPersonResponse_QNAME, AddPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "findPerson")
    public JAXBElement<FindPerson> createFindPerson(FindPerson value) {
        return new JAXBElement<FindPerson>(_FindPerson_QNAME, FindPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "findPersonResponse")
    public JAXBElement<FindPersonResponse> createFindPersonResponse(FindPersonResponse value) {
        return new JAXBElement<FindPersonResponse>(_FindPersonResponse_QNAME, FindPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "findPersons")
    public JAXBElement<FindPersons> createFindPersons(FindPersons value) {
        return new JAXBElement<FindPersons>(_FindPersons_QNAME, FindPersons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersonsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "findPersonsResponse")
    public JAXBElement<FindPersonsResponse> createFindPersonsResponse(FindPersonsResponse value) {
        return new JAXBElement<FindPersonsResponse>(_FindPersonsResponse_QNAME, FindPersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "removePerson")
    public JAXBElement<RemovePerson> createRemovePerson(RemovePerson value) {
        return new JAXBElement<RemovePerson>(_RemovePerson_QNAME, RemovePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "removePersonResponse")
    public JAXBElement<RemovePersonResponse> createRemovePersonResponse(RemovePersonResponse value) {
        return new JAXBElement<RemovePersonResponse>(_RemovePersonResponse_QNAME, RemovePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

}
