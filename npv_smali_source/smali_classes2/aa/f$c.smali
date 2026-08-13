.class final Laa/f$c;
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
.field public static final D:Laa/f$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laa/f$c;

    invoke-direct {v0}, Laa/f$c;-><init>()V

    sput-object v0, Laa/f$c;->D:Laa/f$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lt0/a;
    .locals 9

    new-instance v8, Lt0/a;

    invoke-static {}, Laa/f;->a()Lo0/E1;

    move-result-object v1

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lt0/a;-><init>(Lo0/E1;JJILy7/k;)V

    return-object v8
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Laa/f$c;->a()Lt0/a;

    move-result-object v0

    return-object v0
.end method
