.class public final LM8/i;
.super LM8/c;
.source "SourceFile"


# static fields
.field public static final C:LM8/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/i;

    invoke-direct {v0}, LM8/i;-><init>()V

    sput-object v0, LM8/i;->C:LM8/i;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LM8/c;-><init>(Ly7/k;)V

    return-void
.end method


# virtual methods
.method public d()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic e(ILjava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, LM8/i;->g(ILjava/lang/Void;)V

    return-void
.end method

.method public f(I)Ljava/lang/Void;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public g(ILjava/lang/Void;)V
    .locals 0

    const-string p1, "value"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LM8/i;->f(I)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LM8/i$a;

    invoke-direct {v0}, LM8/i$a;-><init>()V

    return-object v0
.end method
