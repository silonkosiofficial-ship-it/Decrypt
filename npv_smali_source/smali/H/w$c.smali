.class final LH/w$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/w;-><init>(LH/D;LV/Q0;Landroidx/compose/ui/platform/s1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LH/w$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH/w$c;

    invoke-direct {v0}, LH/w$c;-><init>()V

    sput-object v0, LH/w$c;->D:LH/w$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LS0/V;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS0/V;

    invoke-virtual {p0, p1}, LH/w$c;->a(LS0/V;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
