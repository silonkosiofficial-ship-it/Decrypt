.class public final LR8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR8/h;
.implements LR8/c;


# instance fields
.field private final a:LR8/h;

.field private final b:I


# direct methods
.method public constructor <init>(LR8/h;I)V
    .locals 1

    .prologue
    const-string v0, "sequence"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR8/b;->a:LR8/h;

    iput p2, p0, LR8/b;->b:I

    if-ltz p2, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "count must be non-negative, but was "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static final synthetic b(LR8/b;)I
    .locals 0

    iget p0, p0, LR8/b;->b:I

    return p0
.end method

.method public static final synthetic c(LR8/b;)LR8/h;
    .locals 0

    iget-object p0, p0, LR8/b;->a:LR8/h;

    return-object p0
.end method


# virtual methods
.method public a(I)LR8/h;
    .locals 2

    .prologue
    iget v0, p0, LR8/b;->b:I

    add-int/2addr v0, p1

    if-gez v0, :cond_0

    new-instance v0, LR8/b;

    invoke-direct {v0, p0, p1}, LR8/b;-><init>(LR8/h;I)V

    goto :goto_0

    :cond_0
    new-instance p1, LR8/b;

    iget-object v1, p0, LR8/b;->a:LR8/h;

    invoke-direct {p1, v1, v0}, LR8/b;-><init>(LR8/h;I)V

    move-object v0, p1

    :goto_0
    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LR8/b$a;

    invoke-direct {v0, p0}, LR8/b$a;-><init>(LR8/b;)V

    return-object v0
.end method
