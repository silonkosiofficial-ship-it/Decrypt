.class public abstract Ly7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF7/b;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly7/f$a;
    }
.end annotation


# static fields
.field public static final I:Ljava/lang/Object;


# instance fields
.field private transient C:LF7/b;

.field protected final D:Ljava/lang/Object;

.field private final E:Ljava/lang/Class;

.field private final F:Ljava/lang/String;

.field private final G:Ljava/lang/String;

.field private final H:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ly7/f$a;->a()Ly7/f$a;

    move-result-object v0

    sput-object v0, Ly7/f;->I:Ljava/lang/Object;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/f;->D:Ljava/lang/Object;

    iput-object p2, p0, Ly7/f;->E:Ljava/lang/Class;

    iput-object p3, p0, Ly7/f;->F:Ljava/lang/String;

    iput-object p4, p0, Ly7/f;->G:Ljava/lang/String;

    iput-boolean p5, p0, Ly7/f;->H:Z

    return-void
.end method


# virtual methods
.method public a()LF7/b;
    .locals 1

    .prologue
    iget-object v0, p0, Ly7/f;->C:LF7/b;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ly7/f;->e()LF7/b;

    move-result-object v0

    iput-object v0, p0, Ly7/f;->C:LF7/b;

    :cond_0
    return-object v0
.end method

.method protected abstract e()LF7/b;
.end method

.method public f()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly7/f;->D:Ljava/lang/Object;

    return-object v0
.end method

.method public g()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Ly7/f;->m()LF7/b;

    move-result-object v0

    invoke-interface {v0}, LF7/b;->g()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly7/f;->F:Ljava/lang/String;

    return-object v0
.end method

.method public k()LF7/e;
    .locals 2

    .prologue
    iget-object v0, p0, Ly7/f;->E:Ljava/lang/Class;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Ly7/f;->H:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ly7/P;->c(Ljava/lang/Class;)LF7/e;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method protected m()LF7/b;
    .locals 1

    .prologue
    invoke-virtual {p0}, Ly7/f;->a()LF7/b;

    move-result-object v0

    if-eq v0, p0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lw7/b;

    invoke-direct {v0}, Lw7/b;-><init>()V

    throw v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly7/f;->G:Ljava/lang/String;

    return-object v0
.end method
