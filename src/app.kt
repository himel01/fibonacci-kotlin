fun main() {
	var first=0
	var second=1
	var blanket=89
	var counter=0
	var nextNo=first+second
	while(nextNo<=blanket)
	{
		first=second
            second=nextNo
            nextNo=first+second
            counter++
	}
	 print("they can help ${counter} Ngo")//it should say 11 but since 1 comes twice, it would say 10
}