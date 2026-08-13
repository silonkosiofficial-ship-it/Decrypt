.class public final Lda/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lda/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/d;->g()Lda/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:I

.field final synthetic b:Lda/d;


# direct methods
.method constructor <init>(Lda/d;)V
    .locals 0

    iput-object p1, p0, Lda/d$a;->b:Lda/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lda/d;->h()Lorg/w3c/dom/Node;

    move-result-object p1

    invoke-interface {p1}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object p1

    invoke-interface {p1}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result p1

    iput p1, p0, Lda/d$a;->a:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lda/d$a;->a:I

    return v0
.end method

.method public b(I)Lda/c;
    .locals 1

    .prologue
    iget-object v0, p0, Lda/d$a;->b:Lda/d;

    invoke-virtual {v0}, Lda/d;->h()Lorg/w3c/dom/Node;

    move-result-object v0

    invoke-interface {v0}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v0

    invoke-interface {v0, p1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object p1

    instance-of v0, p1, Lorg/w3c/dom/Element;

    if-eqz v0, :cond_0

    new-instance v0, Lda/b;

    check-cast p1, Lorg/w3c/dom/Element;

    invoke-direct {v0, p1}, Lda/b;-><init>(Lorg/w3c/dom/Element;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lda/d;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {v0, p1}, Lda/d;-><init>(Lorg/w3c/dom/Node;)V

    :goto_0
    return-object v0
.end method
