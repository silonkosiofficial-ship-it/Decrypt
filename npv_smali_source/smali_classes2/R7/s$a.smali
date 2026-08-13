.class LR7/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/s;->T0()LF8/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:LR7/s;


# direct methods
.method constructor <init>(LR7/s;)V
    .locals 0

    iput-object p1, p0, LR7/s$a;->C:LR7/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LO7/f0;)Ljava/lang/Boolean;
    .locals 0

    invoke-interface {p1}, LO7/f0;->x0()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/f0;

    invoke-virtual {p0, p1}, LR7/s$a;->a(LO7/f0;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
