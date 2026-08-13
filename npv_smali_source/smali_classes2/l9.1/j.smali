.class public final Ll9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/e;


# instance fields
.field private final a:Lx7/l;


# direct methods
.method public constructor <init>(Lx7/l;)V
    .locals 1

    const-string v0, "string"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/j;->a:Lx7/l;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Appendable;Z)V
    .locals 0

    const-string p3, "builder"

    invoke-static {p2, p3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, Ll9/j;->a:Lx7/l;

    invoke-interface {p3, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method
