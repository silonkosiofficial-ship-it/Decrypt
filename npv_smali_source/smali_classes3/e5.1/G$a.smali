.class Le5/G$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD5/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le5/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/Set;

.field private final b:LD5/c;


# direct methods
.method public constructor <init>(Ljava/util/Set;LD5/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le5/G$a;->a:Ljava/util/Set;

    iput-object p2, p0, Le5/G$a;->b:LD5/c;

    return-void
.end method
