.class final Laa/z$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/z;->g(Laa/y;LV/n;I)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Laa/z$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laa/z$c;

    invoke-direct {v0}, Laa/z$c;-><init>()V

    sput-object v0, Laa/z$c;->D:Laa/z$c;

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

    invoke-virtual {p0}, Laa/z$c;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
