.class public final Lg8/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB8/h;


# instance fields
.field private final a:Lg8/r;

.field private final b:Lg8/j;


# direct methods
.method public constructor <init>(Lg8/r;Lg8/j;)V
    .locals 1

    const-string v0, "kotlinClassFinder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializedDescriptorResolver"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/k;->a:Lg8/r;

    iput-object p2, p0, Lg8/k;->b:Lg8/j;

    return-void
.end method


# virtual methods
.method public a(Ln8/b;)LB8/g;
    .locals 2

    .prologue
    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg8/k;->a:Lg8/r;

    iget-object v1, p0, Lg8/k;->b:Lg8/j;

    invoke-virtual {v1}, Lg8/j;->d()LB8/k;

    move-result-object v1

    invoke-virtual {v1}, LB8/k;->g()LB8/l;

    move-result-object v1

    invoke-static {v1}, LP8/c;->a(LB8/l;)Lm8/e;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lg8/s;->b(Lg8/r;Ln8/b;Lm8/e;)Lg8/t;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {v0}, Lg8/t;->c()Ln8/b;

    move-result-object v1

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p1, p0, Lg8/k;->b:Lg8/j;

    invoke-virtual {p1, v0}, Lg8/j;->j(Lg8/t;)LB8/g;

    move-result-object p1

    return-object p1
.end method
