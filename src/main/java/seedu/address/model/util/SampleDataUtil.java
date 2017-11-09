package seedu.address.model.util;

import static seedu.address.logic.commands.PhotoCommand.DEFAULT_PHOTO_PATH;

import java.util.HashSet;
import java.util.Set;

import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.person.Address;
import seedu.address.model.person.Birthday;
import seedu.address.model.person.Email;
import seedu.address.model.person.Gender;
import seedu.address.model.person.MatricNo;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.person.PhotoPath;
import seedu.address.model.person.Remark;
import seedu.address.model.person.exceptions.DuplicatePersonException;
import seedu.address.model.person.timetable.Timetable;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Person[] getSamplePersons() {
        try {
            return new Person[]{
                new Person(new Name("Select Me"), new Gender("Male"),
                        new MatricNo("A1234567X"), new Phone("91234567"), new Email("example@example.com"),
                        new Address("Blk 123 Orchard Road"), new Timetable("http://modsn.us/FX3uR"),
                        new Remark("Type \"clear\" to clear address book"), new PhotoPath(DEFAULT_PHOTO_PATH),
                        getTagSet("Science", "NUSSU"), new Birthday("25101996")),
                new Person(new Name("Labayna Neil Brian Narido"), new Gender("Male"), new MatricNo("A0155006R"),
                        new Phone("96474278"), new Email("neilbrian.nl@gmail.com"),
                        new Address("Blk 630, Yishun St 61"), new Timetable("http://modsn.us/VLQ3g"),
                        new Remark("Handsome"), new PhotoPath(DEFAULT_PHOTO_PATH), getTagSet("CS2101", "CS2103T"),
                        new Birthday("02101995")),
                new Person(new Name("Fan Yuting"), new Gender("Female"), new MatricNo("A0162531F"),
                        new Phone("96855667"), new Email("fyt0616@gmail.com"),
                        new Address("Prince George Park Residences NUS"),
                        new Timetable("http://modsn.us/aHN0q"),
                        new Remark("[Likes playing Dota 2]"), new PhotoPath(DEFAULT_PHOTO_PATH),
                        getTagSet("CS2105", "CS2101", "CS2103T"), new Birthday("16061998")),
                new Person(new Name("Tsai Yu Hsuan"), new Gender("Female"), new MatricNo("A0163331N"),
                        new Phone("95569202"), new Email("cindy93@gmail.com"),
                        new Address("7 Serangoon Avenue 2, #13-07"),
                        new Timetable("http://modsn.us/VLQ3g"),
                        new Remark(""), new PhotoPath(DEFAULT_PHOTO_PATH), getTagSet("CS2101", "CS2103T"),
                        new Birthday("18081993")),
                new Person(new Name("Zachary Tang"), new Gender("Male"), new MatricNo("A0133788N"),
                        new Phone("91676489"), new Email("zachtang@gmail.com"),
                        new Address("Blk 43 Marine Crescent, #24-02"),
                        new Timetable("http://modsn.us/9UKRW"),
                        new Remark("Big Dreamer"), new PhotoPath(DEFAULT_PHOTO_PATH),
                        getTagSet("CS2101", "CS2103T"), new Birthday("06121995")),
                new Person(new Name("Isabel Tan"), new Gender("Female"), new MatricNo("A0466707R"),
                        new Phone("92492021"), new Email("isabel.tan@gmail.com"),
                        new Address("Blk 47 Tampines Street 20, #17-35"), new Timetable("http://modsn.us/9UKRW"),
                        new Remark(""), new PhotoPath(DEFAULT_PHOTO_PATH), getTagSet("ComputingClub"),
                        new Birthday("07121998")),
                new Person(new Name("Thomas Spencer"), new Gender("Male"), new MatricNo("A0155531K"),
                        new Phone("92624417"), new Email("royb@example.com"),
                        new Address("RC4 NUS UTown"), new Timetable("http://modsn.us/0ECRP"),
                        new Remark("[From London]"), new PhotoPath(DEFAULT_PHOTO_PATH),
                        getTagSet("ExchangeStudent", "Business"), new Birthday("05111998")),
                new Person(new Name("Bobby Chin"), new Gender("Male"), new MatricNo("A0177348L"),
                        new Phone("99635723"), new Email("chinnybob@gmail.com"),
                        new Address("Blk 320, Ang Mo Kio St 32"), new Timetable("http://modsn.us/9UKRW"),
                        new Remark(""), new PhotoPath(DEFAULT_PHOTO_PATH),
                        getTagSet("Arts", "Sociology"), new Birthday("01101994")),
                new Person(new Name("Bruce Banner"), new Gender("Male"), new MatricNo("A4467880N"),
                        new Phone("99049128"), new Email("buenapflug@example.com"),
                        new Address("Blk 16 Bukit Panjang Street 85, #13-04"), new Timetable("http://modsn.us/GWp3V"),
                        new Remark("Triggered"), new PhotoPath(DEFAULT_PHOTO_PATH),
                        getTagSet("Business", "MA1330"), new Birthday("20041996")),
                new Person(new Name("Marlin Nathaniel"), new Gender("Male"), new MatricNo("A3481535O"),
                        new Phone("98344997"), new Email("marlinnathaniel@example.com"),
                        new Address("Blk 21 Hougang Street 80, #14-25"), new Timetable("http://modsn.us/AWYIc"),
                        new Remark(""), new PhotoPath(DEFAULT_PHOTO_PATH),
                        getTagSet("Business", "NUSSU"), new Birthday("25011994")),
                new Person(new Name("Madalene Mcphearson"), new Gender("Male"), new MatricNo("A1796495R"),
                        new Phone("91720552"), new Email("madalenemcphearson@example.com"),
                        new Address("Blk 16 Serangoon Gardens Street 76, #02-15"),
                        new Timetable("http://modsn.us/AWYIc"),
                        new Remark(""), new PhotoPath(DEFAULT_PHOTO_PATH),
                        getTagSet("Arts", "NUSSU"), new Birthday("15041991")),
                new Person(new Name("Kathline Guida"), new Gender("Female"), new MatricNo("A3285865D"),
                        new Phone("92552370"), new Email("kathlineguida@example.com"),
                        new Address("Blk 16 Serangoon Gardens Street 76, #02-15"),
                        new Timetable("http://modsn.us/rBmlH"),
                        new Remark(""), new PhotoPath(DEFAULT_PHOTO_PATH),
                        getTagSet("Engineering", "ComputingClub"), new Birthday("20101992")),
                new Person(new Name("Young Marley"), new Gender("Female"), new MatricNo("A8571220C"),
                        new Phone("95314096"), new Email("youngmarley@example.com"),
                        new Address("Blk 192 Lorong 4 MacPherson, #09-20"), new Timetable("http://modsn.us/AWYIc"),
                        new Remark(""), new PhotoPath(DEFAULT_PHOTO_PATH),
                        getTagSet("Science", "MA1101R"), new Birthday("15061993")),
                new Person(new Name("Barbar Messineo"), new Gender("Female"), new MatricNo("A3981800L"),
                        new Phone("99284431"), new Email("barbarmessineo@example.com"),
                        new Address("Blk 330 Kallang Street 73, #05-17"), new Timetable("http://modsn.us/Oqiyc"),
                        new Remark(""), new PhotoPath(DEFAULT_PHOTO_PATH),
                        getTagSet("Arts", "MA1101R"), new Birthday("15061993")),
                new Person(new Name("Lucilla Awong"), new Gender("Male"), new MatricNo("A2256727R"),
                        new Phone("94572019"), new Email("lucillaawong@example.com"),
                        new Address("Blk 122 Aljunied Lane, #04-26"), new Timetable("http://modsn.us/FX3uR"),
                        new Remark(""), new PhotoPath(DEFAULT_PHOTO_PATH),
                        getTagSet("Science", "MA1330"), new Birthday("20031992")),
                new Person(new Name("Tai Yeung"), new Gender("Female"), new MatricNo("A2796193O"),
                        new Phone("96492016"), new Email("taiyeung@example.com"),
                        new Address("41 Buangkok Walk"), new Timetable("http://modsn.us/rBmlH"),
                        new Remark(""), new PhotoPath(DEFAULT_PHOTO_PATH),
                        getTagSet("Science", "CS2010"), new Birthday("25101991")),
                new Person(new Name("Migdalia Valencia"), new Gender("Male"), new MatricNo("A5673729W"),
                        new Phone("92644585"), new Email("migdaliavalencia@example.com"),
                        new Address("46 Lavender Crescent"), new Timetable("http://modsn.us/Oqiyc"),
                        new Remark(""), new PhotoPath(DEFAULT_PHOTO_PATH),
                        getTagSet("Arts", "MA1101R"), new Birthday("01101994")),
                new Person(new Name("Almeda Abboud"), new Gender("Female"), new MatricNo("A3395772A"),
                        new Phone("93118324"), new Email("almedaabboud@example.com"),
                        new Address("Blk 122 Aljunied Lane, #04-26"), new Timetable("http://modsn.us/Oqiyc"),
                        new Remark(""), new PhotoPath(DEFAULT_PHOTO_PATH),
                        getTagSet("Science", "MA1101R"), new Birthday("20041991")),
                new Person(new Name("Jeannine Dillingham"), new Gender("Female"), new MatricNo("A3423732X"),
                        new Phone("96593876"), new Email("jeanninedillingham@example.com"),
                        new Address("Blk 192 Lorong 4 MacPherson, #09-20"), new Timetable("http://modsn.us/AWYIc"),
                        new Remark(""), new PhotoPath(DEFAULT_PHOTO_PATH),
                        getTagSet("Arts", "MA1101R"), new Birthday("01121996")),
                new Person(new Name("Jule Mcphatter"), new Gender("Male"), new MatricNo("A1681721Q"),
                        new Phone("94288455"), new Email("julemcphatter@example.com"),
                        new Address("Blk 407 Pasir Ris Street 11, #08-21"), new Timetable("http://modsn.us/Oqiyc"),
                        new Remark(""), new PhotoPath(DEFAULT_PHOTO_PATH),
                        getTagSet("Business", "MA1101R"), new Birthday("25061997")),
                new Person(new Name("Ilene Billiot"), new Gender("Male"), new MatricNo("A2794916O"),
                        new Phone("91148432"), new Email("ilenebilliot@example.com"),
                        new Address("Blk 16 Bukit Panjang Street 85, #13-04"), new Timetable("http://modsn.us/FX3uR"),
                        new Remark(""), new PhotoPath(DEFAULT_PHOTO_PATH),
                        getTagSet("Science", "NUSSU"), new Birthday("25101996"))
            };
        } catch (IllegalValueException e) {
            throw new AssertionError("sample data cannot be invalid", e);
        }
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        try {
            AddressBook sampleAb = new AddressBook();
            for (Person samplePerson : getSamplePersons()) {
                sampleAb.addPerson(samplePerson);
            }
            return sampleAb;
        } catch (DuplicatePersonException e) {
            throw new AssertionError("sample data cannot contain duplicate persons", e);
        }
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) throws IllegalValueException {
        HashSet<Tag> tags = new HashSet<>();
        for (String s : strings) {
            tags.add(new Tag(s));
        }
        return tags;
    }
}
