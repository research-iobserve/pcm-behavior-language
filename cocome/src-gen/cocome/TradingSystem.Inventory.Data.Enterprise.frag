::IMPORTS::
import javax.persistence.EntityManager;
::IMPORTS END::
::ANNOTATIONS::
@Stateless
::ANNOTATIONS END::
::VARIABLES::
public static int a;	
public static MyClass my;	
public static List<MyClass> array;	
// Injected database connection:
@PersistenceContext private EntityManager em;
::VARIABLES END::
::METHODS FOR::EnterpriseQueryIf
::METHOD::queryEnterpriseById
a
 = (5 - a
);
my.name
 = "Brian";
array[a
]
 = my
;
array
 = my
;
for (boolean b : array
) {
}
if ((a
 > 2)) {
} else {
}
::METHOD_END::
::METHODS END::
