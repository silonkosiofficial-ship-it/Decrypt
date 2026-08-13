.class final Laa/f$i;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/f;->n(Laa/d;LV/n;I)Lu0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Laa/f$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laa/f$i;

    invoke-direct {v0}, Laa/f$i;-><init>()V

    sput-object v0, Laa/f$i;->D:Laa/f$i;

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
    .locals 1

    invoke-static {}, Laa/f;->b()Lu0/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Laa/f$i;->a()Lu0/d;

    move-result-object v0

    return-object v0
.end method
