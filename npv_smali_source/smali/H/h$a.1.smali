.class final LH/h$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h;->a(LS0/V;Lx7/l;Landroidx/compose/ui/d;LM0/P;LS0/g0;Lx7/l;Lz/l;Lo0/n0;ZIILS0/s;LH/u;ZZLx7/q;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LH/h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH/h$a;

    invoke-direct {v0}, LH/h$a;-><init>()V

    sput-object v0, LH/h$a;->D:LH/h$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LM0/K;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LM0/K;

    invoke-virtual {p0, p1}, LH/h$a;->a(LM0/K;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
