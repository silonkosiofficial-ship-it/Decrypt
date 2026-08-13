.class public final Lk9/q;
.super Lk9/a;
.source "SourceFile"


# instance fields
.field private final a:Lk9/b;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/Object;

.field private final d:Lk9/m;


# direct methods
.method public constructor <init>(Lk9/b;Ljava/lang/String;Ljava/lang/Object;Lk9/m;)V
    .locals 1

    const-string v0, "accessor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lk9/a;-><init>()V

    iput-object p1, p0, Lk9/q;->a:Lk9/b;

    iput-object p2, p0, Lk9/q;->b:Ljava/lang/String;

    iput-object p3, p0, Lk9/q;->c:Ljava/lang/Object;

    iput-object p4, p0, Lk9/q;->d:Lk9/m;

    return-void
.end method

.method public synthetic constructor <init>(Lk9/b;Ljava/lang/String;Ljava/lang/Object;Lk9/m;ILy7/k;)V
    .locals 1

    .prologue
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    invoke-interface {p1}, Lm9/a;->getName()Ljava/lang/String;

    move-result-object p2

    :cond_0
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lk9/q;-><init>(Lk9/b;Ljava/lang/String;Ljava/lang/Object;Lk9/m;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lk9/q;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public b()Lk9/b;
    .locals 1

    iget-object v0, p0, Lk9/q;->a:Lk9/b;

    return-object v0
.end method

.method public c()Lk9/m;
    .locals 1

    iget-object v0, p0, Lk9/q;->d:Lk9/m;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk9/q;->b:Ljava/lang/String;

    return-object v0
.end method
