.class final LJ0/d$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ0/d;->e(Landroid/view/ScrollCaptureSession;LY0/r;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LJ0/d$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ0/d$e;

    invoke-direct {v0}, LJ0/d$e;-><init>()V

    sput-object v0, LJ0/d$e;->D:LJ0/d$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 0

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LJ0/d$e;->a(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
