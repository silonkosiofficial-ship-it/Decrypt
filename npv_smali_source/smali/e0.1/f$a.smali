.class final Le0/f$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le0/f;->a(LV/n;I)Le0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Le0/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le0/f$a;

    invoke-direct {v0}, Le0/f$a;-><init>()V

    sput-object v0, Le0/f$a;->D:Le0/f$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Le0/e;
    .locals 3

    new-instance v0, Le0/e;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Le0/e;-><init>(Ljava/util/Map;ILy7/k;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Le0/f$a;->a()Le0/e;

    move-result-object v0

    return-object v0
.end method
