.class final LS/X0$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/X0;->f(Lu/j;ZLx7/a;LV/n;II)LV/G1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS/X0$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/X0$g;

    invoke-direct {v0}, LS/X0$g;-><init>()V

    sput-object v0, LS/X0$g;->D:LS/X0$g;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/X0$g;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
