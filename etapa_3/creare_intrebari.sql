create table intrebari(Id_test Numeric(2) NOT NULL,Nr_intrebare Numeric(2) NOT NULL, Enunt Varchar(500) NOT NULL,Rasp1 Varchar(300) NOT NULL,Rasp2 Varchar(300) NOT NULL,Rasp3 Varchar(300) NOT NULL,Rasp4 Varchar(300) NOT NULL,Solutie Varchar(300)NOT NULL);
alter table intrebari add constraint intr_id_fk FOREIGN KEY (Id_test) REFERENCES test(Id_test);
insert into intrebari values('1','1','What is the most important thing you should consider when making something in 3d?','Size','Gravity','Functionality','Quality','B');
insert into intrebari values('1','2','What is the first thing you should consider when making something in 3d?','Quality','Functionality','Price','Size','D');
insert into intrebari values('1','3','What is the file format we export to print?','Obj','Stj','Stl','Slt','C');
insert into intrebari values('1','4','What does 3d mean?','Movies','3 dimensions','Stereoscopic','Computer graphics','B');
insert into intrebari values('1','5','What can be 3d?','Computer graphics','Movies','Sculptures','All of the above','D');
insert into intrebari values('2','1','Who creates 123D Design?','Alias','Markerware','Autodesk','Shapeways','C');
insert into intrebari values('2','2','What makes 3d printing superior to other crafting techniques?','Efficiency','Speed','Quality','Customization','D');
insert into intrebari values('2','3','What is it called when I need to move an object in 3d?','Move','Push','Translate','Grab','C');
insert into intrebari values('2','4','Which axis determintes if the object is 3d?','Z','X','Y','O','A');
insert into intrebari values('2','5','If I want to quickly make a cup and only use a spline/line to create it. Which tool do I use to make it 3d?','Sweep','Loft','Extrude','Revolve','D');
insert into intrebari values('3','1','What is the cause of prints not sticking?','Greasy french fries','Filament warping or not touching buildplate','Printing too slow','Too much infill','B');
insert into intrebari values('3','2','Which of the following is NOT a method to get filament to stick to print bed?','Use hairspray','Use a brim or raft','Use superglue','Use a skirt or glass buildplate','C');
insert into intrebari values('3','3','If layers are not sticking which is not a solution?','Adjust print bed temperature','Adjust temperature inside room','Raise nozzle temperature','Lower nozzle temperature','D');
insert into intrebari values('3','4','Warping prints are caused by...','Print bed not level','Filament not sticking to bed','Print bed not heated','All of the above','D');
insert into intrebari values('3','5','What simple item is used to check the printing bed level?','Computer paper','Notebook paper','Construction paper','Vaneer caliper','A');
