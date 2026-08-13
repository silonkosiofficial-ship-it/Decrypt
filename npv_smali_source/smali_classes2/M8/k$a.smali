.class public final LM8/k$a;
.super LM8/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM8/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final b:LM8/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/k$a;

    invoke-direct {v0}, LM8/k$a;-><init>()V

    sput-object v0, LM8/k$a;->b:LM8/k$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-string v0, "must be a member function"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LM8/k;-><init>(Ljava/lang/String;Ly7/k;)V

    return-void
.end method


# virtual methods
.method public a(LO7/y;)Z
    .locals 1

    .prologue
    const-string v0, "functionDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/a;->m0()LO7/X;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
