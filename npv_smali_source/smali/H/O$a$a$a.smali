.class public final LH/O$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/O$a$a;->a(LV/N;)LV/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LV/w0;

.field final synthetic b:Lz/l;


# direct methods
.method public constructor <init>(LV/w0;Lz/l;)V
    .locals 0

    iput-object p1, p0, LH/O$a$a$a;->a:LV/w0;

    iput-object p2, p0, LH/O$a$a$a;->b:Lz/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    .prologue
    iget-object v0, p0, LH/O$a$a$a;->a:LV/w0;

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/n$b;

    if-eqz v0, :cond_1

    new-instance v1, Lz/n$a;

    invoke-direct {v1, v0}, Lz/n$a;-><init>(Lz/n$b;)V

    iget-object v0, p0, LH/O$a$a$a;->b:Lz/l;

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lz/l;->a(Lz/i;)Z

    :cond_0
    iget-object v0, p0, LH/O$a$a$a;->a:LV/w0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LV/w0;->setValue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
