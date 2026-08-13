.class public final LK7/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg8/t$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK7/a;->c(Lg8/t;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly7/K;


# direct methods
.method constructor <init>(Ly7/K;)V
    .locals 0

    iput-object p1, p0, LK7/a$a;->a:Ly7/K;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public c(Ln8/b;LO7/a0;)Lg8/t$a;
    .locals 1

    .prologue
    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, LX7/A;->a:LX7/A;

    invoke-virtual {p2}, LX7/A;->a()Ln8/b;

    move-result-object p2

    invoke-static {p1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LK7/a$a;->a:Ly7/K;

    const/4 p2, 0x1

    iput-boolean p2, p1, Ly7/K;->C:Z

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
