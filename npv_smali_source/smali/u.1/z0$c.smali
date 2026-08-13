.class final Lu/z0$c;
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
.field public static final D:Lu/z0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu/z0$c;

    invoke-direct {v0}, Lu/z0$c;-><init>()V

    sput-object v0, Lu/z0$c;->D:Lu/z0$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(F)Lu/n;
    .locals 1

    new-instance v0, Lu/n;

    invoke-direct {v0, p1}, Lu/n;-><init>(F)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LY0/i;

    invoke-virtual {p1}, LY0/i;->v()F

    move-result p1

    invoke-virtual {p0, p1}, Lu/z0$c;->a(F)Lu/n;

    move-result-object p1

    return-object p1
.end method
