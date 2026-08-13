.class final Lu/z0$o;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lu/z0$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu/z0$o;

    invoke-direct {v0}, Lu/z0$o;-><init>()V

    sput-object v0, Lu/z0$o;->D:Lu/z0$o;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ln0/i;)Lu/q;
    .locals 4

    new-instance v0, Lu/q;

    invoke-virtual {p1}, Ln0/i;->i()F

    move-result v1

    invoke-virtual {p1}, Ln0/i;->l()F

    move-result v2

    invoke-virtual {p1}, Ln0/i;->j()F

    move-result v3

    invoke-virtual {p1}, Ln0/i;->e()F

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Lu/q;-><init>(FFFF)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln0/i;

    invoke-virtual {p0, p1}, Lu/z0$o;->a(Ln0/i;)Lu/q;

    move-result-object p1

    return-object p1
.end method
