.class final Lu/z0$k;
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
.field public static final D:Lu/z0$k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu/z0$k;

    invoke-direct {v0}, Lu/z0$k;-><init>()V

    sput-object v0, Lu/z0$k;->D:Lu/z0$k;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)Lu/n;
    .locals 1

    new-instance v0, Lu/n;

    int-to-float p1, p1

    invoke-direct {v0, p1}, Lu/n;-><init>(F)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lu/z0$k;->a(I)Lu/n;

    move-result-object p1

    return-object p1
.end method
