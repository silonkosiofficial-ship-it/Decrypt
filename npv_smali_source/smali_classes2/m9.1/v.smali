.class public final Lm9/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/o;


# instance fields
.field private final a:Lx7/l;


# direct methods
.method public constructor <init>(Lx7/l;)V
    .locals 1

    const-string v0, "operation"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/v;->a:Lx7/l;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;
    .locals 1

    const-string v0, "input"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lm9/v;->a:Lx7/l;

    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lm9/k;->a:Lm9/k$a;

    invoke-virtual {p1, p3}, Lm9/k$a;->b(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
