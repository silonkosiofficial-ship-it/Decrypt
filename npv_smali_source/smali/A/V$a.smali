.class final LA/V$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA/V;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LA/V$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LA/V$a;

    invoke-direct {v0}, LA/V$a;-><init>()V

    sput-object v0, LA/V$a;->D:LA/V$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LA/S;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, v0, v0, v0}, LA/U;->a(IIII)LA/S;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LA/V$a;->a()LA/S;

    move-result-object v0

    return-object v0
.end method
