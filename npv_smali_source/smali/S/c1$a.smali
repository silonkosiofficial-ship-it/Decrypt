.class final LS/c1$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS/c1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS/c1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/c1$a;

    invoke-direct {v0}, LS/c1$a;-><init>()V

    sput-object v0, LS/c1$a;->D:LS/c1$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    const/4 v0, 0x0

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    return v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/c1$a;->a()F

    move-result v0

    invoke-static {v0}, LY0/i;->m(F)LY0/i;

    move-result-object v0

    return-object v0
.end method
