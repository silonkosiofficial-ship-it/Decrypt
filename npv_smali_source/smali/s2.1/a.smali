.class public abstract Ls2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ls2/a;->a:I

    iput p2, p0, Ls2/a;->b:I

    return-void
.end method


# virtual methods
.method public a(Ly2/b;)V
    .locals 1

    .prologue
    const-string v0, "connection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lr2/a;

    if-eqz v0, :cond_0

    check-cast p1, Lr2/a;

    invoke-virtual {p1}, Lr2/a;->a()Lz2/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Ls2/a;->b(Lz2/d;)V

    return-void

    :cond_0
    new-instance p1, Li7/t;

    const-string v0, "Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function."

    invoke-direct {p1, v0}, Li7/t;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract b(Lz2/d;)V
.end method
