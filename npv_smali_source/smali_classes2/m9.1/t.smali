.class public final Lm9/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/o;


# instance fields
.field private final a:Lx7/p;

.field private final b:Z

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lx7/p;ZLjava/lang/String;)V
    .locals 1

    const-string v0, "isNegativeSetter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whatThisExpects"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/t;->a:Lx7/p;

    iput-boolean p2, p0, Lm9/t;->b:Z

    iput-object p3, p0, Lm9/t;->c:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic b(Lm9/t;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lm9/t;->c:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;
    .locals 1

    .prologue
    const-string v0, "input"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lt p3, v0, :cond_0

    sget-object p1, Lm9/k;->a:Lm9/k$a;

    invoke-virtual {p1, p3}, Lm9/k$a;->b(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p2, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p2

    const/16 v0, 0x2d

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Lm9/t;->a:Lx7/p;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lm9/k;->a:Lm9/k$a;

    add-int/lit8 p3, p3, 0x1

    invoke-virtual {p1, p3}, Lm9/k$a;->b(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    const/16 v0, 0x2b

    if-ne p2, v0, :cond_2

    iget-boolean v0, p0, Lm9/t;->b:Z

    if-eqz v0, :cond_2

    iget-object p2, p0, Lm9/t;->a:Lx7/p;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p2, p1, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lm9/k;->a:Lm9/k$a;

    add-int/lit8 p3, p3, 0x1

    invoke-virtual {p1, p3}, Lm9/k$a;->b(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object p1, Lm9/k;->a:Lm9/k$a;

    new-instance v0, Lm9/t$a;

    invoke-direct {v0, p0, p2}, Lm9/t$a;-><init>(Lm9/t;C)V

    invoke-virtual {p1, p3, v0}, Lm9/k$a;->a(ILx7/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm9/t;->c:Ljava/lang/String;

    return-object v0
.end method
