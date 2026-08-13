.class public abstract Li9/T;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LE7/c;

    const/16 v1, 0x61

    const/16 v2, 0x7a

    invoke-direct {v0, v1, v2}, LE7/c;-><init>(CC)V

    new-instance v1, LE7/c;

    const/16 v2, 0x41

    const/16 v3, 0x5a

    invoke-direct {v1, v2, v3}, LE7/c;-><init>(CC)V

    invoke-static {v0, v1}, Lj7/v;->A0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/16 v1, 0x5b

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    const/16 v2, 0x5d

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    const/16 v3, 0x27

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Character;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v1, 0x1

    aput-object v2, v4, v1

    const/4 v1, 0x2

    aput-object v3, v4, v1

    invoke-static {v4}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Li9/T;->a:Ljava/util/List;

    return-void
.end method

.method public static final synthetic a(Li9/o;Li9/S;)V
    .locals 0

    invoke-static {p0, p1}, Li9/T;->i(Li9/o;Li9/S;)V

    return-void
.end method

.method public static final synthetic b()Ljava/util/List;
    .locals 1

    sget-object v0, Li9/T;->a:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic c(Li9/S$b;Ljava/lang/String;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0, p1}, Li9/T;->j(Li9/S$b;Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(CI)Li9/S;
    .locals 0

    invoke-static {p0, p1}, Li9/T;->l(CI)Li9/S;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Li9/S$b;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0}, Li9/T;->m(Li9/S$b;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0, p1}, Li9/T;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Li9/S$b;I)Ljava/lang/Void;
    .locals 0

    invoke-static {p0, p1}, Li9/T;->p(Li9/S$b;I)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Li9/o;Ljava/lang/String;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pattern"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li9/S;->a:Li9/S$a;

    invoke-virtual {v0, p1}, Li9/S$a;->a(Ljava/lang/String;)Li9/S;

    move-result-object p1

    invoke-static {p0, p1}, Li9/T;->i(Li9/o;Li9/S;)V

    return-void
.end method

.method private static final i(Li9/o;Li9/S;)V
    .locals 3

    .prologue
    instance-of v0, p1, Li9/S$e;

    if-eqz v0, :cond_0

    check-cast p1, Li9/S$e;

    invoke-virtual {p1}, Li9/S$e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Li9/o;->c(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Li9/S$d;

    if-eqz v0, :cond_1

    check-cast p1, Li9/S$d;

    invoke-virtual {p1}, Li9/S$d;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li9/S;

    invoke-static {p0, v0}, Li9/T;->i(Li9/o;Li9/S;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Li9/S$c;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    new-array v0, v0, [Lx7/l;

    sget-object v1, Li9/T$a;->D:Li9/T$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Li9/T$b;

    invoke-direct {v1, p1}, Li9/T$b;-><init>(Li9/S;)V

    invoke-static {p0, v0, v1}, Li9/p;->a(Li9/o;[Lx7/l;Lx7/l;)V

    goto/16 :goto_1

    :cond_2
    instance-of v0, p1, Li9/S$b;

    if-eqz v0, :cond_c

    move-object v0, p1

    check-cast v0, Li9/S$b;

    instance-of v1, v0, Li9/S$b$c;

    if-eqz v1, :cond_4

    instance-of v0, p0, Li9/o$d;

    if-eqz v0, :cond_3

    check-cast p1, Li9/S$b$c;

    check-cast p0, Li9/o$d;

    invoke-virtual {p1, p0}, Li9/S$b$c;->c(Li9/o$d;)V

    goto/16 :goto_1

    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "A time-based directive "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " was used in a format builder that doesn\'t support time components"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    instance-of v1, v0, Li9/S$b$a;

    if-eqz v1, :cond_6

    instance-of v0, p0, Li9/o$a;

    if-eqz v0, :cond_5

    check-cast p1, Li9/S$b$a;

    check-cast p0, Li9/o$a;

    invoke-virtual {p1, p0}, Li9/S$b$a;->c(Li9/o$a;)V

    goto/16 :goto_1

    :cond_5
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "A date-based directive "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " was used in a format builder that doesn\'t support date components"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    instance-of v1, v0, Li9/S$b$d;

    if-eqz v1, :cond_8

    instance-of v0, p0, Li9/o$c;

    if-eqz v0, :cond_7

    check-cast p1, Li9/S$b$d;

    check-cast p0, Li9/o$c;

    invoke-virtual {p1, p0}, Li9/S$b$d;->c(Li9/o$c;)V

    goto :goto_1

    :cond_7
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "A time-zone-based directive "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " was used in a format builder that doesn\'t support time-zone components"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    instance-of v1, v0, Li9/S$b$b;

    if-eqz v1, :cond_a

    instance-of v0, p0, Li9/o$e;

    if-eqz v0, :cond_9

    check-cast p1, Li9/S$b$b;

    check-cast p0, Li9/o$e;

    invoke-virtual {p1, p0}, Li9/S$b$b;->c(Li9/o$e;)V

    goto :goto_1

    :cond_9
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "A UTC-offset-based directive "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " was used in a format builder that doesn\'t support UTC offset components"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    instance-of p0, v0, Li9/U;

    if-nez p0, :cond_b

    goto :goto_1

    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The meaning of the directive \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' is unknown"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c
    :goto_1
    return-void
.end method

.method private static final j(Li9/S$b;Ljava/lang/String;)Ljava/lang/Void;
    .locals 3

    .prologue
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The directive \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\' is locale-dependent, but locales are not supported in Kotlin"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ". "

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string p0, ""

    :goto_0
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static synthetic k(Li9/S$b;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Li9/T;->j(Li9/S$b;Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method private static final l(CI)Li9/S;
    .locals 1

    .prologue
    const/16 v0, 0x47

    if-ne p0, v0, :cond_0

    new-instance p0, Li9/S$b$a$f;

    invoke-direct {p0, p1}, Li9/S$b$a$f;-><init>(I)V

    goto/16 :goto_0

    :cond_0
    const/16 v0, 0x79

    if-ne p0, v0, :cond_1

    new-instance p0, Li9/S$b$a$s;

    invoke-direct {p0, p1}, Li9/S$b$a$s;-><init>(I)V

    goto/16 :goto_0

    :cond_1
    const/16 v0, 0x59

    if-ne p0, v0, :cond_2

    new-instance p0, Li9/S$b$a$o;

    invoke-direct {p0, p1}, Li9/S$b$a$o;-><init>(I)V

    goto/16 :goto_0

    :cond_2
    const/16 v0, 0x75

    if-ne p0, v0, :cond_3

    new-instance p0, Li9/S$b$a$r;

    invoke-direct {p0, p1}, Li9/S$b$a$r;-><init>(I)V

    goto/16 :goto_0

    :cond_3
    const/16 v0, 0x55

    if-ne p0, v0, :cond_4

    new-instance p0, Li9/S$b$a$a;

    invoke-direct {p0, p1}, Li9/S$b$a$a;-><init>(I)V

    goto/16 :goto_0

    :cond_4
    const/16 v0, 0x72

    if-ne p0, v0, :cond_5

    new-instance p0, Li9/S$b$a$k;

    invoke-direct {p0, p1}, Li9/S$b$a$k;-><init>(I)V

    goto/16 :goto_0

    :cond_5
    const/16 v0, 0x51

    if-ne p0, v0, :cond_6

    new-instance p0, Li9/S$b$a$j;

    invoke-direct {p0, p1}, Li9/S$b$a$j;-><init>(I)V

    goto/16 :goto_0

    :cond_6
    const/16 v0, 0x71

    if-ne p0, v0, :cond_7

    new-instance p0, Li9/S$b$a$n;

    invoke-direct {p0, p1}, Li9/S$b$a$n;-><init>(I)V

    goto/16 :goto_0

    :cond_7
    const/16 v0, 0x4d

    if-ne p0, v0, :cond_8

    new-instance p0, Li9/S$b$a$i;

    invoke-direct {p0, p1}, Li9/S$b$a$i;-><init>(I)V

    goto/16 :goto_0

    :cond_8
    const/16 v0, 0x4c

    if-ne p0, v0, :cond_9

    new-instance p0, Li9/S$b$a$m;

    invoke-direct {p0, p1}, Li9/S$b$a$m;-><init>(I)V

    goto/16 :goto_0

    :cond_9
    const/16 v0, 0x77

    if-ne p0, v0, :cond_a

    new-instance p0, Li9/S$b$a$q;

    invoke-direct {p0, p1}, Li9/S$b$a$q;-><init>(I)V

    goto/16 :goto_0

    :cond_a
    const/16 v0, 0x57

    if-ne p0, v0, :cond_b

    new-instance p0, Li9/S$b$a$p;

    invoke-direct {p0, p1}, Li9/S$b$a$p;-><init>(I)V

    goto/16 :goto_0

    :cond_b
    const/16 v0, 0x64

    if-ne p0, v0, :cond_c

    new-instance p0, Li9/S$b$a$b;

    invoke-direct {p0, p1}, Li9/S$b$a$b;-><init>(I)V

    goto/16 :goto_0

    :cond_c
    const/16 v0, 0x44

    if-ne p0, v0, :cond_d

    new-instance p0, Li9/S$b$a$e;

    invoke-direct {p0, p1}, Li9/S$b$a$e;-><init>(I)V

    goto/16 :goto_0

    :cond_d
    const/16 v0, 0x46

    if-ne p0, v0, :cond_e

    new-instance p0, Li9/S$b$a$d;

    invoke-direct {p0, p1}, Li9/S$b$a$d;-><init>(I)V

    goto/16 :goto_0

    :cond_e
    const/16 v0, 0x67

    if-ne p0, v0, :cond_f

    new-instance p0, Li9/S$b$a$h;

    invoke-direct {p0, p1}, Li9/S$b$a$h;-><init>(I)V

    goto/16 :goto_0

    :cond_f
    const/16 v0, 0x45

    if-ne p0, v0, :cond_10

    new-instance p0, Li9/S$b$a$c;

    invoke-direct {p0, p1}, Li9/S$b$a$c;-><init>(I)V

    goto/16 :goto_0

    :cond_10
    const/16 v0, 0x65

    if-ne p0, v0, :cond_11

    new-instance p0, Li9/S$b$a$g;

    invoke-direct {p0, p1}, Li9/S$b$a$g;-><init>(I)V

    goto/16 :goto_0

    :cond_11
    const/16 v0, 0x63

    if-ne p0, v0, :cond_12

    new-instance p0, Li9/S$b$a$l;

    invoke-direct {p0, p1}, Li9/S$b$a$l;-><init>(I)V

    goto/16 :goto_0

    :cond_12
    const/16 v0, 0x61

    if-ne p0, v0, :cond_13

    new-instance p0, Li9/S$b$c$b;

    invoke-direct {p0, p1}, Li9/S$b$c$b;-><init>(I)V

    goto/16 :goto_0

    :cond_13
    const/16 v0, 0x68

    if-ne p0, v0, :cond_14

    new-instance p0, Li9/S$b$c$a;

    invoke-direct {p0, p1}, Li9/S$b$c$a;-><init>(I)V

    goto/16 :goto_0

    :cond_14
    const/16 v0, 0x48

    if-ne p0, v0, :cond_15

    new-instance p0, Li9/S$b$c$c;

    invoke-direct {p0, p1}, Li9/S$b$c$c;-><init>(I)V

    goto/16 :goto_0

    :cond_15
    const/16 v0, 0x6d

    if-ne p0, v0, :cond_16

    new-instance p0, Li9/S$b$c$d;

    invoke-direct {p0, p1}, Li9/S$b$c$d;-><init>(I)V

    goto/16 :goto_0

    :cond_16
    const/16 v0, 0x73

    if-ne p0, v0, :cond_17

    new-instance p0, Li9/S$b$c$e$a;

    invoke-direct {p0, p1}, Li9/S$b$c$e$a;-><init>(I)V

    goto/16 :goto_0

    :cond_17
    const/16 v0, 0x53

    if-ne p0, v0, :cond_18

    new-instance p0, Li9/S$b$c$f$a;

    invoke-direct {p0, p1}, Li9/S$b$c$f$a;-><init>(I)V

    goto/16 :goto_0

    :cond_18
    const/16 v0, 0x41

    if-ne p0, v0, :cond_19

    new-instance p0, Li9/S$b$c$f$b;

    invoke-direct {p0, p1}, Li9/S$b$c$f$b;-><init>(I)V

    goto/16 :goto_0

    :cond_19
    const/16 v0, 0x6e

    if-ne p0, v0, :cond_1a

    new-instance p0, Li9/S$b$c$f$d;

    invoke-direct {p0, p1}, Li9/S$b$c$f$d;-><init>(I)V

    goto :goto_0

    :cond_1a
    const/16 v0, 0x4e

    if-ne p0, v0, :cond_1b

    new-instance p0, Li9/S$b$c$f$c;

    invoke-direct {p0, p1}, Li9/S$b$c$f$c;-><init>(I)V

    goto :goto_0

    :cond_1b
    const/16 v0, 0x56

    if-ne p0, v0, :cond_1c

    new-instance p0, Li9/S$b$d$b;

    invoke-direct {p0, p1}, Li9/S$b$d$b;-><init>(I)V

    goto :goto_0

    :cond_1c
    const/16 v0, 0x76

    if-ne p0, v0, :cond_1d

    new-instance p0, Li9/S$b$d$a;

    invoke-direct {p0, p1}, Li9/S$b$d$a;-><init>(I)V

    goto :goto_0

    :cond_1d
    const/16 v0, 0x7a

    if-ne p0, v0, :cond_1e

    new-instance p0, Li9/S$b$d$c;

    invoke-direct {p0, p1}, Li9/S$b$d$c;-><init>(I)V

    goto :goto_0

    :cond_1e
    const/16 v0, 0x4f

    if-ne p0, v0, :cond_1f

    new-instance p0, Li9/S$b$b$a;

    invoke-direct {p0, p1}, Li9/S$b$b$a;-><init>(I)V

    goto :goto_0

    :cond_1f
    const/16 v0, 0x58

    if-ne p0, v0, :cond_20

    new-instance p0, Li9/S$b$b$b;

    invoke-direct {p0, p1}, Li9/S$b$b$b;-><init>(I)V

    goto :goto_0

    :cond_20
    const/16 v0, 0x78

    if-ne p0, v0, :cond_21

    new-instance p0, Li9/S$b$b$c;

    invoke-direct {p0, p1}, Li9/S$b$b$c;-><init>(I)V

    goto :goto_0

    :cond_21
    const/16 v0, 0x5a

    if-ne p0, v0, :cond_22

    new-instance p0, Li9/S$b$b$d;

    invoke-direct {p0, p1}, Li9/S$b$b$d;-><init>(I)V

    goto :goto_0

    :cond_22
    new-instance v0, Li9/U;

    invoke-direct {v0, p0, p1}, Li9/U;-><init>(CI)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method private static final m(Li9/S$b;)Ljava/lang/Void;
    .locals 3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown length "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Li9/S$b;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " for the "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Li9/S$b;->b()C

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p0, " directive"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;
    .locals 3

    .prologue
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "kotlinx.datetime formatting does not support the "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " field. "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x20

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string p0, ""

    :goto_0
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "Please report your use case to https://github.com/Kotlin/kotlinx-datetime/issues"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static synthetic o(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Li9/T;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Li9/S$b;I)Ljava/lang/Void;
    .locals 3

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Padding do "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " digits is not supported for the "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Li9/S$b;->b()C

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p0, " directive"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
