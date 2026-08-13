.class public final LM8/d;
.super LM8/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM8/d$a;
    }
.end annotation


# static fields
.field public static final E:LM8/d$a;


# instance fields
.field private C:[Ljava/lang/Object;

.field private D:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LM8/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM8/d$a;-><init>(Ly7/k;)V

    sput-object v0, LM8/d;->E:LM8/d$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x14

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LM8/d;-><init>([Ljava/lang/Object;I)V

    return-void
.end method

.method private constructor <init>([Ljava/lang/Object;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LM8/c;-><init>(Ly7/k;)V

    iput-object p1, p0, LM8/d;->C:[Ljava/lang/Object;

    iput p2, p0, LM8/d;->D:I

    return-void
.end method

.method public static final synthetic f(LM8/d;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LM8/d;->C:[Ljava/lang/Object;

    return-object p0
.end method

.method private final g(I)V
    .locals 2

    .prologue
    iget-object v0, p0, LM8/d;->C:[Ljava/lang/Object;

    array-length v1, v0

    if-le v1, p1, :cond_0

    return-void

    :cond_0
    array-length v0, v0

    :cond_1
    mul-int/lit8 v0, v0, 0x2

    if-le v0, p1, :cond_1

    iget-object p1, p0, LM8/d;->C:[Ljava/lang/Object;

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "copyOf(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LM8/d;->C:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public d()I
    .locals 1

    iget v0, p0, LM8/d;->D:I

    return v0
.end method

.method public e(ILjava/lang/Object;)V
    .locals 1

    .prologue
    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LM8/d;->g(I)V

    iget-object v0, p0, LM8/d;->C:[Ljava/lang/Object;

    aget-object v0, v0, p1

    if-nez v0, :cond_0

    invoke-virtual {p0}, LM8/d;->d()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LM8/d;->D:I

    :cond_0
    iget-object v0, p0, LM8/d;->C:[Ljava/lang/Object;

    aput-object p2, v0, p1

    return-void
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LM8/d;->C:[Ljava/lang/Object;

    invoke-static {v0, p1}, Lj7/n;->g0([Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LM8/d$b;

    invoke-direct {v0, p0}, LM8/d$b;-><init>(LM8/d;)V

    return-object v0
.end method
