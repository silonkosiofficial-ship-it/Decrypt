.class final Laa/z$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/z;->h(Laa/y;[Ljava/lang/Object;LV/n;I)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Laa/z$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laa/z$e;

    invoke-direct {v0}, Laa/z$e;-><init>()V

    sput-object v0, Laa/z$e;->D:Laa/z$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Laa/z$e;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
