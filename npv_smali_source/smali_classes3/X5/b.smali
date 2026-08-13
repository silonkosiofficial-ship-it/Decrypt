.class public final LX5/b;
.super LW5/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX5/b$a;,
        LX5/b$b;
    }
.end annotation


# static fields
.field public static final b:LX5/b$a;

.field private static final c:Ljava/util/Set;


# instance fields
.field private final a:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LX5/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX5/b$a;-><init>(Ly7/k;)V

    sput-object v0, LX5/b;->b:LX5/b$a;

    sget-object v0, LX5/b$b;->C:LX5/b$b;

    invoke-static {v0}, Lj7/Z;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LX5/b;->c:Ljava/util/Set;

    return-void
.end method

.method public varargs constructor <init>([LX5/b$b;)V
    .locals 1

    .prologue
    const-string v0, "options"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LW5/e;-><init>()V

    array-length v0, p1

    if-nez v0, :cond_0

    sget-object p1, LX5/b;->c:Ljava/util/Set;

    goto :goto_0

    :cond_0
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LX5/b;->a:Ljava/util/Set;

    return-void
.end method

.method private final d(LX5/b$b;)Z
    .locals 1

    iget-object v0, p0, LX5/b;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public a(Ljava/lang/String;ILjava/lang/StringBuilder;)I
    .locals 7

    .prologue
    const-string v0, "input"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stringBuilder"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x26

    const/4 v3, 0x0

    if-ne v1, v2, :cond_e

    add-int/lit8 v1, v0, -0x2

    if-ge p2, v1, :cond_e

    add-int/lit8 v1, p2, 0x1

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x23

    if-ne v1, v2, :cond_e

    add-int/lit8 v1, p2, 0x2

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v4, 0x78

    const/4 v5, 0x1

    if-eq v2, v4, :cond_1

    const/16 v4, 0x58

    if-ne v2, v4, :cond_0

    goto :goto_0

    :cond_0
    move p2, v3

    goto :goto_1

    :cond_1
    :goto_0
    add-int/lit8 v1, p2, 0x3

    if-ne v1, v0, :cond_2

    return v3

    :cond_2
    move p2, v5

    :goto_1
    move v2, v1

    :goto_2
    if-ge v2, v0, :cond_5

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v6, 0x30

    if-gt v6, v4, :cond_3

    const/16 v6, 0x3a

    if-ge v4, v6, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v6, 0x61

    if-gt v6, v4, :cond_4

    const/16 v6, 0x67

    if-ge v4, v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v6, 0x41

    if-gt v6, v4, :cond_5

    const/16 v6, 0x47

    if-ge v4, v6, :cond_5

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    if-eq v2, v0, :cond_6

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v4, 0x3b

    if-ne v0, v4, :cond_6

    goto :goto_4

    :cond_6
    move v5, v3

    :goto_4
    if-nez v5, :cond_9

    sget-object v0, LX5/b$b;->C:LX5/b$b;

    invoke-direct {p0, v0}, LX5/b;->d(LX5/b$b;)Z

    move-result v0

    if-eqz v0, :cond_7

    return v3

    :cond_7
    sget-object v0, LX5/b$b;->E:LX5/b$b;

    invoke-direct {p0, v0}, LX5/b;->d(LX5/b$b;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_5

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Semi-colon required at end of numeric entity"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    :goto_5
    if-eqz p2, :cond_a

    :try_start_0
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x10

    invoke-static {v0}, LS8/a;->a(I)I

    move-result v0

    :goto_6
    invoke-static {p1, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p1

    goto :goto_7

    :cond_a
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0xa

    invoke-static {v0}, LS8/a;->a(I)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :goto_7
    const v0, 0xffff

    if-le p1, v0, :cond_b

    sget-object v0, LY5/a;->a:LY5/a;

    invoke-virtual {v0, p1}, LY5/a;->e(I)[C

    move-result-object p1

    array-length v0, p1

    :goto_8
    if-ge v3, v0, :cond_c

    aget-char v4, p1, v3

    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_b
    if-ltz p1, :cond_d

    if-gt p1, v0, :cond_d

    int-to-char p1, p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_c
    add-int/lit8 v2, v2, 0x2

    sub-int/2addr v2, v1

    add-int/2addr v2, p2

    add-int/2addr v2, v5

    return v2

    :cond_d
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid Char code: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :catch_0
    :cond_e
    return v3
.end method
