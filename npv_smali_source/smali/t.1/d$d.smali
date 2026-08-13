.class final Lt/d$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt/d;->f(ZLandroidx/compose/ui/d;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lt/d$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt/d$d;

    invoke-direct {v0}, Lt/d$d;-><init>()V

    sput-object v0, Lt/d$d;->D:Lt/d$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Z)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lt/d$d;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
