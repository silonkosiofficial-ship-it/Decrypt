.class final Laa/f$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laa/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Laa/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laa/f$b;

    invoke-direct {v0}, Laa/f$b;-><init>()V

    sput-object v0, Laa/f$b;->D:Laa/f$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lu0/d;
    .locals 13

    new-instance v12, Lu0/d$a;

    const/4 v0, 0x1

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v2

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v3

    const/16 v10, 0xe0

    const/4 v11, 0x0

    const-string v1, "emptyImageVector"

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Lu0/d$a;-><init>(Ljava/lang/String;FFFFJIZILy7/k;)V

    invoke-virtual {v12}, Lu0/d$a;->f()Lu0/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Laa/f$b;->a()Lu0/d;

    move-result-object v0

    return-object v0
.end method
