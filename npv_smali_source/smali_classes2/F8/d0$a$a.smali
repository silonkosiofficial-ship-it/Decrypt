.class public final LF8/d0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/d0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/d0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lx7/a;)V
    .locals 1

    .prologue
    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LF8/d0$a$a;->a:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, LF8/d0$a$a;->a:Z

    return-void
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, LF8/d0$a$a;->a:Z

    return v0
.end method
