.class public final Lz0/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field private C:Lz0/L;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .prologue
    iget-object v0, p0, Lz0/T;->C:Lz0/L;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lz0/L;->l(Z)V

    :goto_0
    return-void
.end method

.method public final e(Lz0/L;)V
    .locals 0

    iput-object p1, p0, Lz0/T;->C:Lz0/L;

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lz0/T;->a(Z)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
