.class final Lo2/D$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/D;-><init>(Lo2/n;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;ZLx7/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lo2/D$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo2/D$g;

    invoke-direct {v0}, Lo2/D$g;-><init>()V

    sput-object v0, Lo2/D$g;->D:Lo2/D$g;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lo2/D$g;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
