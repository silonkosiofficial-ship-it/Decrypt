.class public abstract Lk9/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/l;


# instance fields
.field private final a:Lk9/n;

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(Lk9/n;II)V
    .locals 1

    const-string v0, "field"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/y;->a:Lk9/n;

    iput p2, p0, Lk9/y;->b:I

    iput p3, p0, Lk9/y;->c:I

    return-void
.end method


# virtual methods
.method public a()Ll9/e;
    .locals 4

    new-instance v0, Ll9/f;

    new-instance v1, Lk9/y$a;

    iget-object v2, p0, Lk9/y;->a:Lk9/n;

    invoke-interface {v2}, Lk9/n;->b()Lk9/b;

    move-result-object v2

    invoke-direct {v1, v2}, Lk9/y$a;-><init>(Ljava/lang/Object;)V

    iget v2, p0, Lk9/y;->b:I

    iget v3, p0, Lk9/y;->c:I

    invoke-direct {v0, v1, v2, v3}, Ll9/f;-><init>(Lx7/l;II)V

    return-object v0
.end method

.method public b()Lm9/q;
    .locals 4

    iget v0, p0, Lk9/y;->b:I

    iget v1, p0, Lk9/y;->c:I

    iget-object v2, p0, Lk9/y;->a:Lk9/n;

    invoke-interface {v2}, Lk9/n;->b()Lk9/b;

    move-result-object v2

    iget-object v3, p0, Lk9/y;->a:Lk9/n;

    invoke-interface {v3}, Lk9/n;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lm9/p;->a(IILm9/a;Ljava/lang/String;)Lm9/q;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lk9/n;
    .locals 1

    iget-object v0, p0, Lk9/y;->a:Lk9/n;

    return-object v0
.end method
