.class final Lu/z0$p;
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
.field public static final D:Lu/z0$p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu/z0$p;

    invoke-direct {v0}, Lu/z0$p;-><init>()V

    sput-object v0, Lu/z0$p;->D:Lu/z0$p;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/q;)Ln0/i;
    .locals 4

    new-instance v0, Ln0/i;

    invoke-virtual {p1}, Lu/q;->f()F

    move-result v1

    invoke-virtual {p1}, Lu/q;->g()F

    move-result v2

    invoke-virtual {p1}, Lu/q;->h()F

    move-result v3

    invoke-virtual {p1}, Lu/q;->i()F

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Ln0/i;-><init>(FFFF)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu/q;

    invoke-virtual {p0, p1}, Lu/z0$p;->a(Lu/q;)Ln0/i;

    move-result-object p1

    return-object p1
.end method
