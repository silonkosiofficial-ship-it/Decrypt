.class final LV2/e$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LV2/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV2/e$a;

    invoke-direct {v0}, LV2/e$a;-><init>()V

    sput-object v0, LV2/e$a;->D:LV2/e$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 2

    invoke-static {}, LV2/e;->a()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lo0/A0;->h(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lo0/y0;

    invoke-virtual {p1}, Lo0/y0;->w()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LV2/e$a;->a(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object p1

    return-object p1
.end method
