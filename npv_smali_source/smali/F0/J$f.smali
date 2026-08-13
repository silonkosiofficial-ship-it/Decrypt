.class public abstract LF0/J$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/I;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "f"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF0/J$f;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LF0/J$f;->f(LD0/o;Ljava/util/List;I)Ljava/lang/Void;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method

.method public bridge synthetic c(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LF0/J$f;->h(LD0/o;Ljava/util/List;I)Ljava/lang/Void;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method

.method public d(LD0/o;Ljava/util/List;I)Ljava/lang/Void;
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object p2, p0, LF0/J$f;->a:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic e(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LF0/J$f;->g(LD0/o;Ljava/util/List;I)Ljava/lang/Void;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method

.method public f(LD0/o;Ljava/util/List;I)Ljava/lang/Void;
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object p2, p0, LF0/J$f;->a:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g(LD0/o;Ljava/util/List;I)Ljava/lang/Void;
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object p2, p0, LF0/J$f;->a:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(LD0/o;Ljava/util/List;I)Ljava/lang/Void;
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object p2, p0, LF0/J$f;->a:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic j(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LF0/J$f;->d(LD0/o;Ljava/util/List;I)Ljava/lang/Void;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method
