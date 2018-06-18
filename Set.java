package com.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Set {
 public static void main(String[] args)
 {
HashSet<String> set=new HashSet<String>();	
set.add("one");
set.add("two");
set.add("three");
set.add("four");
set.add("two");
System.out.println(set);
ArrayList<String> list=new ArrayList<String>();
list.add("balaji");
list.add("karthi");
list.add("mohan");
list.add("dinesh");
list.add("balaji");
HashSet<String> setone=new HashSet<String>(list); 
System.out.println(setone);
LinkedHashSet<String> linkedSet=new LinkedHashSet<String>();
linkedSet.add("one");
for(int i=0;i<10;i++)
{
	linkedSet.add("two "+i);
	setone.add("two"+i);
}
System.out.println(linkedSet);
System.out.println(setone);

 TreeSet<String> tree=new TreeSet< String>();
 tree.add("one");
 tree.add("two");
 tree.add("three");
 tree.add("four");
 tree.add("two");
 System.out.println(tree);
 NavigableSet<String> navi=tree.headSet("three",false);
 System.out.println(navi);
 NavigableSet<String> navitail=tree.tailSet("three",false);
 System.out.println(navitail);
 
 }
}