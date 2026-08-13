.class final LS/K$h;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/K;->b(Landroidx/compose/ui/d;Ljava/lang/Long;Lx7/l;LT/f;Lx7/p;Lx7/p;ILS/L;LT/k;Ljava/util/Locale;LS/M;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS/K$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/K$h;

    invoke-direct {v0}, LS/K$h;-><init>()V

    sput-object v0, LS/K$h;->D:LS/K$h;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LV/w0;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, ""

    invoke-static {v2, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/K$h;->a()LV/w0;

    move-result-object v0

    return-object v0
.end method
