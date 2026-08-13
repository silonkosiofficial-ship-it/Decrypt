.class public final LM8/t$d;
.super LM8/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM8/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final b:LM8/t$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/t$d;

    invoke-direct {v0}, LM8/t$d;-><init>()V

    sput-object v0, LM8/t$d;->b:LM8/t$d;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-string v0, "must have a single value parameter"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LM8/t;-><init>(Ljava/lang/String;Ly7/k;)V

    return-void
.end method


# virtual methods
.method public a(LO7/y;)Z
    .locals 1

    .prologue
    const-string v0, "functionDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/a;->n()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
